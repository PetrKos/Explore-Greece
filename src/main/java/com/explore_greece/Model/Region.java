package com.explore_greece.Model;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * TODO: check the following issue:
 * enum shows up in H2 database, but not in postman.
 */
//@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Region {
    HERAKLION,
    CHANIA,
    RETHYMNO,
    LASITHI

}
