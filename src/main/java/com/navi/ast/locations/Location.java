package com.navi.ast.locations;

import com.navi.ast.AstNode;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Location extends AstNode {
    private String identifier;
    private List<LocationAccess> accesses;
}
