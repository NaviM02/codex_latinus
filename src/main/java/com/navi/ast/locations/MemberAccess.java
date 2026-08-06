package com.navi.ast.locations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberAccess extends LocationAccess {
    private String member;
}
