package org.operamasks.faces.util;

public class JsObject {
    private Object value;
    public JsObject(Object value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
    	if (value == null)
    		return null;
    	
        return value.toString();
    }
}
