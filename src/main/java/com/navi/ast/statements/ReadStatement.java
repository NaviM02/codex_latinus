package com.navi.ast.statements;

import com.navi.ast.locations.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ReadStatement extends Statement {
    private Location location;
}
