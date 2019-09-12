package com.odoo.addons.hr.providers;

import com.odoo.addons.hr.models.HrEmployee;
import com.odoo.core.orm.provider.BaseModelProvider;

public class HrEmployeeProvider extends BaseModelProvider {
    public static final String TAG = HrEmployeeProvider.class.getSimpleName();

    @Override
    public String authority() {
        return HrEmployee.AUTHORITY;
    }
}
