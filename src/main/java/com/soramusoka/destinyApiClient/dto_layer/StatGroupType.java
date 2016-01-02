package com.soramusoka.destinyApiClient.dto_layer;

public enum StatGroupType {
    Values("Values"), General("General"), Weapons("Weapons"), Medals("Medals"), Enemies("Enemies");

    private final String _value;

    private StatGroupType(String value) {
        this._value = value;
    }

    public String getValue() {
        return this._value;
    }
}
