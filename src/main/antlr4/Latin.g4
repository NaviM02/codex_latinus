grammar Latin;

// program
program
    : structDeclaration*
      globalVariablesSection?
      functionSection?
      mainSection
      FINIS_PROGRAM ';'
      EOF
    ;

globalVariablesSection
    : VARIABLES_SECTION
      declaration*
    ;

functionSection
    : FUNCTIONS_SECTION
      functionDeclaration*
    ;

mainSection
    : MAIN_SECTION
      statement*
    ;

declarationSection
    : declaration*
    ;

declaration
    : variableDeclaration
    | arrayDeclaration
    | structDeclaration
    ;

// struct
structDeclaration
    : STRUCTURA ID '{' structField* '}' FINIS ';'
    ;

structField
    : variableDeclaration
    | arrayDeclaration
    ;

functionDeclaration
    : procedureDeclaration
    | functionWithReturn
    ;

procedureDeclaration
    : ACTIO ID '(' parameterList? ')' functionBody FINIS ';'
    ;

functionWithReturn
    : RATIO type ID '(' parameterList? ')' functionBody FINIS ';'
    ;

parameterList
    : parameter (',' parameter)*
    ;

parameter
    : ESTO ID ':' type
    ;


functionBody
    : '{' localVariableSection? statement* '}'
    ;

localVariableSection
    : VARIABILES '[' declaration* ']'
    ;

// statement
statement
    : assignment
    | ifStatement
    | whileStatement
    | doWhileStatement
    | forStatement
    | returnStatement
    | breakStatement
    | continueStatement
    | printStatement
    | readStatement
    ;

ifStatement
    : SI '(' expression ')' block elseIfStatement* elseStatement? FINIS ';'
    ;

elseIfStatement
    : ALITER '(' expression ')' block
    ;

elseStatement
    : ALITER block
    ;

block
    : '{' statement* '}'
    ;

whileStatement
    : DUM '(' expression ')' block FINIS ';'
    ;

doWhileStatement
    : FACERE block DUM '(' expression ')' ';'
    ;

forStatement
    : PER '(' variableDeclaration expression ';' expression ')' block FINIS ';'
    ;

returnStatement
    : REDDERE expression? ';'
    ;

continueStatement
    : PERGE ';'
    ;

breakStatement
    : INTERRUMPE ';'
    ;

argumentList
    : expression (',' expression)*
    ;

readStatement
    : location? READ
    ;

printStatement
    : PRINT expression (PRINT expression)* ';'
    ;

// declarations
variableDeclaration
    : ESTO ID ':' type expression? ';'
    ;

type
    : NUMERUS
    | DECIMALIS
    | TEXTUM
    | LITTERA
    | VERUM
    | FALSUS
    | ID
    ;

arrayDeclaration
    : SERIES ID '[' expression ']' ':' type arrayInitializer? ';'
    ;

arrayInitializer
    : '{' expression (',' expression)* '}'
    ;

assignment
    : location '=' expression ';'
    ;

location
    : ID ( '[' expression ']' | '.' ID )*
    ;

// expr
expression
    : logicalOrExpression
    ;

logicalOrExpression
    : logicalAndExpression ( OR logicalAndExpression )*
    ;

logicalAndExpression
    : equalityExpression ( AND equalityExpression )*
    ;

equalityExpression
    : comparisonExpression ( (EQUAL | NOT_EQUAL) comparisonExpression )*
    ;

comparisonExpression
    : additiveExpression ( (LESS | GREATER | LESS_EQUAL | GREATER_EQUAL) additiveExpression )*
    ;

additiveExpression
    : multiplicativeExpression ( (PLUS | MINUS) multiplicativeExpression )*
    ;

multiplicativeExpression
    : unaryExpression ( (MULT | DIV) unaryExpression )*
    ;

unaryExpression
    : NON unaryExpression
    | PLUSPLUS unaryExpression
    | MINUSMINUS unaryExpression
    | postfixExpression
    ;

postfixExpression
    : primaryExpression
      (
            '[' expression ']'
        |   '.' ID
        |   functionArguments
      )*
    ;

functionArguments
    : '(' argumentList? ')'
    ;

primaryExpression
    : NUMBER                 #NumberLiteralExpr
    | DECIMAL                #DecimalLiteralExpr
    | STRING                 #StringLiteralExpr
    | CHAR                   #CharLiteralExpr
    | VERUM                  #TrueLiteralExpr
    | FALSUS                 #FalseLiteralExpr
    | ID                     #VariableExpr
    | '(' expression ')'     #ParenthesizedExpr
    ;

// lexer
VARIABLES_SECTION : 'VARIABILES>';
FUNCTIONS_SECTION : 'MUNERA>';
MAIN_SECTION : 'MAIOR>';
FINIS_PROGRAM : 'FINIS';
STRUCTURA : 'structura';
FINIS : 'finis';
ESTO : 'esto';
SERIES : 'series';
ACTIO : 'actio';
RATIO : 'ratio';
SI : 'si';
ALITER : 'aliter';
DUM : 'dum';
FACERE : 'facere';
PER : 'per';
REDDERE : 'reddere';
PERGE : 'perge';
INTERRUMPE : 'interrumpe';
VARIABILES : 'VARIABILES';
NUMERUS : 'numerus';
DECIMALIS : 'decimalis';
TEXTUM : 'textum';
LITTERA : 'littera';
VERUM : 'verum';
FALSUS : 'falsus';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
PLUSPLUS : '++';
MINUSMINUS : '--';
AND : '&&';
OR : '||';
NON : 'non';
EQUAL : '==';
NOT_EQUAL : '!=';
LESS : '<';
GREATER : '>';
LESS_EQUAL : '<=';
GREATER_EQUAL : '>=';
READ : '<<';
PRINT : '>>';

NUMBER
    : [0-9]+
    ;

DECIMAL
    : [0-9]+ '.' [0-9]+
    ;
STRING
    : '"' (~["\r\n])* '"'
    ;

CHAR
    : '\'' . '\''
    ;

ID
    : [a-zA-Z_][a-zA-Z0-9_]*
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '##' .*? '##' -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
