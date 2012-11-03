/**
 * UIDateField.java
 * DO NOT EDIT THIS FILE
 * This file was automatically generated by org.operamasks.faces.tools.apt.ComponentAnnotationProcessorFactory
 * at Sat Nov 03 15:46:26 CST 2012
 */

package org.operamasks.faces.webapp.form;

/**
* @jsp.tag name="dateField" body-content="JSP"
*/
public class UIDateFieldTag extends org.operamasks.faces.webapp.html.HtmlBasicELTag {
    public String getComponentType() {
	return "org.operamasks.faces.component.form.impl.UIDateField";
    }

    public String getRendererType() {
	return "org.operamasks.faces.component.form.impl.UIDateField";
    }

    private javax.el.ValueExpression altFormats;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setAltFormats(javax.el.ValueExpression value) {
	this.altFormats = value;
    }
    private javax.el.ValueExpression disabledDates;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setDisabledDates(javax.el.ValueExpression value) {
	this.disabledDates = value;
    }
    private javax.el.ValueExpression disabledDatesText;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setDisabledDatesText(javax.el.ValueExpression value) {
	this.disabledDatesText = value;
    }
    private javax.el.ValueExpression disabledDays;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setDisabledDays(javax.el.ValueExpression value) {
	this.disabledDays = value;
    }
    private javax.el.ValueExpression disabledDaysText;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setDisabledDaysText(javax.el.ValueExpression value) {
	this.disabledDaysText = value;
    }
    private javax.el.ValueExpression format;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setFormat(javax.el.ValueExpression value) {
	this.format = value;
    }
    private javax.el.ValueExpression invalidText;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setInvalidText(javax.el.ValueExpression value) {
	this.invalidText = value;
    }
    private javax.el.ValueExpression maxText;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setMaxText(javax.el.ValueExpression value) {
	this.maxText = value;
    }
    private javax.el.ValueExpression maxValue;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setMaxValue(javax.el.ValueExpression value) {
	this.maxValue = value;
    }
    private javax.el.ValueExpression minText;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setMinText(javax.el.ValueExpression value) {
	this.minText = value;
    }
    private javax.el.ValueExpression minValue;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setMinValue(javax.el.ValueExpression value) {
	this.minValue = value;
    }
    private javax.el.ValueExpression triggerClass;
    /**
    * @jsp.attribute type="java.lang.String"
    */
    public void setTriggerClass(javax.el.ValueExpression value) {
	this.triggerClass = value;
    }
    protected void setProperties(javax.faces.component.UIComponent c) {
	super.setProperties(c);
	c.setValueExpression("altFormats", this.altFormats);
	c.setValueExpression("disabledDates", this.disabledDates);
	c.setValueExpression("disabledDatesText", this.disabledDatesText);
	c.setValueExpression("disabledDays", this.disabledDays);
	c.setValueExpression("disabledDaysText", this.disabledDaysText);
	c.setValueExpression("format", this.format);
	c.setValueExpression("invalidText", this.invalidText);
	c.setValueExpression("maxText", this.maxText);
	c.setValueExpression("maxValue", this.maxValue);
	c.setValueExpression("minText", this.minText);
	c.setValueExpression("minValue", this.minValue);
	c.setValueExpression("triggerClass", this.triggerClass);
    }

    public void release() {
	super.release();
	this.altFormats = null;
	this.disabledDates = null;
	this.disabledDatesText = null;
	this.disabledDays = null;
	this.disabledDaysText = null;
	this.format = null;
	this.invalidText = null;
	this.maxText = null;
	this.maxValue = null;
	this.minText = null;
	this.minValue = null;
	this.triggerClass = null;
    }

}