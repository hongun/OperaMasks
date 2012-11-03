/*
 * $Id: CommandButtonTag.java,v 1.4 2007/07/02 07:38:08 jacky Exp $
 *
 * Copyright (C) 2006 Operamasks Community.
 * Copyright (C) 2000-2006 Apusic Systems, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see http://www.gnu.org/licenses.
 */

package org.operamasks.faces.webapp.html;

import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.component.UICommand;
import javax.faces.event.MethodExpressionActionListener;

public class CommandButtonTag extends HtmlBasicELTag
{
    private MethodExpression action;
    private MethodExpression actionListener;

    public String getRendererType() {
        return "javax.faces.Button";
    }

    public String getComponentType() {
        return javax.faces.component.html.HtmlCommandButton.COMPONENT_TYPE;
    }

    public void setAction(MethodExpression action) {
        this.action = action;
    }

    public void setActionListener(MethodExpression actionListener) {
        this.actionListener = actionListener;
    }

    public void setImmediate(ValueExpression immediate) {
        setValueExpression("immediate", immediate);
    }

    public void setValue(ValueExpression value) {
        setValueExpression("value", value);
    }

    public void setAccesskey(ValueExpression accesskey) {
        setValueExpression("accesskey", accesskey);
    }

    public void setAlt(ValueExpression alt) {
        setValueExpression("alt", alt);
    }

    public void setDir(ValueExpression dir) {
        setValueExpression("dir", dir);
    }

    public void setDisabled(ValueExpression disabled) {
        setValueExpression("disabled", disabled);
    }

    public void setImage(ValueExpression image) {
        setValueExpression("image", image);
    }

    public void setLabel(ValueExpression label) {
        setValueExpression("label", label);
    }

    public void setLang(ValueExpression lang) {
        setValueExpression("lang", lang);
    }

    public void setOnblur(ValueExpression onblur) {
        setValueExpression("onblur", onblur);
    }

    public void setOnchange(ValueExpression onchange) {
        setValueExpression("onchange", onchange);
    }

    public void setOnclick(ValueExpression onclick) {
        setValueExpression("onclick", onclick);
    }

    public void setOndblclick(ValueExpression ondblclick) {
        setValueExpression("ondblclick", ondblclick);
    }

    public void setOnfocus(ValueExpression onfocus) {
        setValueExpression("onfocus", onfocus);
    }

    public void setOnkeydown(ValueExpression onkeydown) {
        setValueExpression("onkeydown", onkeydown);
    }

    public void setOnkeypress(ValueExpression onkeypress) {
        setValueExpression("onkeypress", onkeypress);
    }

    public void setOnkeyup(ValueExpression onkeyup) {
        setValueExpression("onkeyup", onkeyup);
    }

    public void setOnmousedown(ValueExpression onmousedown) {
        setValueExpression("onmousedown", onmousedown);
    }

    public void setOnmousemove(ValueExpression onmousemove) {
        setValueExpression("onmousemove", onmousemove);
    }

    public void setOnmouseout(ValueExpression onmouseout) {
        setValueExpression("onmouseout", onmouseout);
    }

    public void setOnmouseover(ValueExpression onmouseover) {
        setValueExpression("onmouseover", onmouseover);
    }

    public void setOnmouseup(ValueExpression onmouseup) {
        setValueExpression("onmouseup", onmouseup);
    }

    public void setOnselect(ValueExpression onselect) {
        setValueExpression("onselect", onselect);
    }

    public void setReadonly(ValueExpression readonly) {
        setValueExpression("readonly", readonly);
    }

    public void setStyle(ValueExpression style) {
        setValueExpression("style", style);
    }

    public void setStyleClass(ValueExpression styleClass) {
        setValueExpression("styleClass", styleClass);
    }

    public void setTabindex(ValueExpression tabindex) {
        setValueExpression("tabindex", tabindex);
    }

    public void setTitle(ValueExpression title) {
        setValueExpression("title", title);
    }

    public void setType(ValueExpression type) {
        setValueExpression("type", type);
    }

    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        UICommand command = (UICommand)component;
        if (action != null)
            command.setActionExpression(action);
        if (actionListener != null)
            command.addActionListener(new MethodExpressionActionListener(actionListener));
    }
}