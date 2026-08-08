grammar Latin;

// global
program
    : globalVariablesSection? functionSection? mainSection FINIS_PROGRAM ';' EOF
    ;

globalVariablesSection
    : VARIABLES_SECTION declaration*
    ;

functionSection
    : FUNCTIONS_SECTION functionDeclaration*
    ;

mainSection
    : MAIN_SECTION statement*
    ;

// structures and functions
structDeclaration
    : STRUCTURA ID '{' structFieldWithSemicolon* '}' FINIS ';'
    | STRUCTURA ID '{' structFieldWithComma* '}' FINIS ';'
    ;

structFieldWithSemicolon
    : ESTO ID ':' type ';'?                 #StructVariableFieldSemicolon
    | ESTO ID ':' booleanLiteral ';'?        #StructBooleanFieldSemicolon
    | SERIES ID (':' type)? ';'?            #StructArrayFieldSemicolon
    ;

structFieldWithComma
    : ESTO ID ':' type ','?                 #StructVariableFieldComma
    | ESTO ID ':' booleanLiteral ','?        #StructBooleanFieldComma
    | SERIES ID (':' type)? ','?            #StructArrayFieldComma
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
    : parameters+=parameter (',' parameters+=parameter)*
    ;

parameter
    : ESTO ID ':' type
    ;

functionBody
    : '{' localVariableSection? statement* '}'
    ;

// declarations
declaration
    : variableDeclaration
    | arrayDeclaration
    | structDeclaration
    ;

localVariableSection
    : VARIABILES '[' declaration* ']'
    ;

variableDeclaration
    : ESTO ID ':' type initializer? ';'   #NormalVarDeclaration
    | ESTO ID ':' booleanLiteral ';'       #BooleanVarDeclaration
    ;

initializer
    : expression          #ExprInit
    | structInitializer   #StructInit
    ;

structInitializer
    : '{' structFieldInitializer (',' structFieldInitializer)* '}'
    ;

structFieldInitializer
    : ID ':' initializer                  // ¡Reutiliza el mismo inicializador simplificado!
    ;

arrayConstructor
    : type '[' expression ']'
    ;

booleanLiteral
    : VERUM
    | FALSUS
    ;

arrayDeclaration
    : SERIES ID '[' expression ']' (':' type)? arrayInitializer? ';'
    ;

arrayInitializer
    : '{' values+=expression (',' values+=expression)* '}'
    ;

type
    : NUMERUS
    | DECIMALIS
    | TEXTUM
    | LITTERA
    | ID
    ;

// statements
statement
    : assignment         #AssignmentStmt
    | ifStatement        #IfStmt
    | whileStatement     #WhileStmt
    | doWhileStatement   #DoWhileStmt
    | forStatement       #ForStmt
    | returnStatement    #ReturnStmt
    | breakStatement     #BreakStmt
    | continueStatement  #ContinueStmt
    | printStatement     #PrintStmt
    | readStatement      #ReadStmt
    ;

assignment
    : postfixExpression '=' initializer ';'
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

readStatement
    : postfixExpression? READ
    ;

printStatement
    : PRINT expressions+=expression (PRINT expressions+=expression)* ';'
    ;

// expressions
expression
    : logicalOrExpression
    ;

logicalOrExpression
    : logicalOrExpression OR logicalAndExpression      #OrExpr
    | logicalAndExpression                             #ToLogicalAndExpr
    ;

logicalAndExpression
    : logicalAndExpression AND equalityExpression      #AndExpr
    | equalityExpression                               #ToEqualityExpr
    ;

equalityExpression
    : equalityExpression EQUAL comparisonExpression        #EqualExpr
    | equalityExpression NOT_EQUAL comparisonExpression    #NotEqualExpr
    | comparisonExpression                                #ToComparisonExpr
    ;

comparisonExpression
    : comparisonExpression LESS additiveExpression             #LessExpr
    | comparisonExpression GREATER additiveExpression          #GreaterExpr
    | comparisonExpression LESS_EQUAL additiveExpression       #LessEqualExpr
    | comparisonExpression GREATER_EQUAL additiveExpression    #GreaterEqualExpr
    | additiveExpression                                       #ToAdditiveExpr
    ;

additiveExpression
    : additiveExpression PLUS multiplicativeExpression     #AdditionExpr
    | additiveExpression MINUS multiplicativeExpression    #SubtractionExpr
    | multiplicativeExpression                             #ToMultiplicativeExpr
    ;

multiplicativeExpression
    : multiplicativeExpression MULT unaryExpression        #MultiplicationExpr
    | multiplicativeExpression DIV unaryExpression         #DivisionExpr
    | unaryExpression                                      #ToUnaryExpr
    ;

unaryExpression
    : NON unaryExpression          #NotExpr
    | PLUSPLUS unaryExpression     #PreIncrementExpr
    | MINUSMINUS unaryExpression   #PreDecrementExpr
    | postfixExpression            #ToPostfixExpr
    ;

postfixExpression
    : postfixExpression '[' expression ']'        #ArrayAccessExpr
    | postfixExpression '.' ID                    #MemberAccessExpr
    | postfixExpression functionArguments         #FunctionCallExpr
    | primaryExpression                           #ToPrimaryExpr
    ;

functionArguments
    : '(' argumentList? ')'
    ;

argumentList
    : arguments+=expression (',' arguments+=expression)*
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

// Lexer
// key words for sections
VARIABLES_SECTION : 'VARIABILES>';
FUNCTIONS_SECTION : 'MUNERA>';
MAIN_SECTION      : 'MAIOR>';
FINIS_PROGRAM     : 'FINIS';

// key words
STRUCTURA  : 'structura';
FINIS      : 'finis';
ESTO       : 'esto';
SERIES     : 'series';
ACTIO      : 'actio';
RATIO      : 'ratio';
SI         : 'si';
ALITER     : 'aliter';
DUM        : 'dum';
FACERE     : 'facere';
PER        : 'per';
REDDERE    : 'reddere';
PERGE      : 'perge';
INTERRUMPE : 'interrumpe';
VARIABILES : 'VARIABILES';

// key word for types
NUMERUS   : 'numerus';
DECIMALIS : 'decimalis';
TEXTUM    : 'textum';
LITTERA   : 'littera';
VERUM     : 'verum';
FALSUS    : 'falsus';

// operators
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
DIV         : '/';
PLUSPLUS    : '++';
MINUSMINUS  : '--';
AND         : '&&';
OR          : '||';
NON         : 'non';
EQUAL       : '==';
NOT_EQUAL   : '!=';
LESS        : '<';
GREATER     : '>';
LESS_EQUAL  : '<=';
GREATER_EQUAL : '>=';
READ        : '<<';
PRINT       : '>>';

// literals
NUMBER  : [0-9]+ ;
DECIMAL : [0-9]+ '.' [0-9]+ ;
STRING  : '"' (~["\r\n])* '"' ;
CHAR    : '\'' . '\'' ;
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;

// comments
LINE_COMMENT  : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '##' .*? '##' -> skip ;
WS            : [ \t\r\n]+ -> skip ;
