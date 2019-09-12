package com.odoo.addons.hr_sms.services;

import android.content.Context;
import android.os.Bundle;

import com.odoo.addons.hr_sms.models.HrEmployee;
import com.odoo.core.service.OSyncAdapter;
import com.odoo.core.service.OSyncService;
import com.odoo.core.support.OUser;

public class HrSyncService extends OSyncService {
    public static final String TAG = HrSyncService.class.getSimpleName();

    @Override
    public OSyncAdapter getSyncAdapter(OSyncService service, Context context) {
        return new OSyncAdapter(getApplicationContext(), HrEmployee.class, this, true);
    }

    @Override
    public void performDataSync(OSyncAdapter adapter, Bundle extras, OUser user) {
        adapter.syncDataLimit(80);
    }
}