package com.odoo.addons.hr_sms.models;

import android.content.Context;
import android.net.Uri;

import com.odoo.core.orm.OModel;
import com.odoo.core.orm.fields.OColumn;
import com.odoo.core.orm.fields.types.OBlob;
import com.odoo.core.orm.fields.types.OVarchar;
import com.odoo.core.support.OUser;

public class HrEmployee extends OModel {
    public static final String TAG = HrEmployee.class.getSimpleName();
    public static final String AUTHORITY = "com.odoo.addons.hr_sms.hr_employee";

    OColumn name = new OColumn("Name", OVarchar.class).setSize(100);
    OColumn image_small = new OColumn("Avatar", OBlob.class).setDefaultValue(false);
    OColumn mobile_phone = new OColumn("Work Mobile",OVarchar.class);
    OColumn work_email = new OColumn("Work Email", OVarchar.class);

    public HrEmployee(Context context, OUser user) {
        super(context, "hr.employee", user);
    }

    @Override
    public Uri uri() {
        return buildURI(AUTHORITY);
    }
}
