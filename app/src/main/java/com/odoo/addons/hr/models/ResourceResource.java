package com.odoo.addons.hr.models;

import android.content.Context;

import com.odoo.core.orm.OModel;
import com.odoo.core.orm.fields.OColumn;
import com.odoo.core.orm.fields.types.OVarchar;
import com.odoo.core.support.OUser;

public class ResourceResource extends OModel {

    OColumn name = new OColumn("Name", OVarchar.class).setSize(100);

    public ResourceResource(Context context, OUser user) {
        super(context, "resource.resource", user);
    }
}
