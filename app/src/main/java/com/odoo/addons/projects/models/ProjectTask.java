package com.odoo.addons.projects.models;

import android.content.Context;
import android.net.Uri;

import com.odoo.core.orm.OModel;
import com.odoo.core.orm.fields.OColumn;
import com.odoo.core.orm.fields.types.OFloat;
import com.odoo.core.orm.fields.types.OText;
import com.odoo.core.orm.fields.types.OVarchar;
import com.odoo.core.support.OUser;

public class ProjectTask extends OModel {
    public static final String TAG = ProjectTask.class.getSimpleName();
    public static final String AUTHORITY = "com.odoo.addons.projects.project_tasks";

    OColumn name = new OColumn("Name", OVarchar.class).setSize(100);
    OColumn project_id = new OColumn("Project", ProjectProject.class, OColumn.RelationType.ManyToOne);
    OColumn description = new OColumn("Description", OText.class);
    OColumn progress = new OColumn("Progress", OFloat.class);

    public ProjectTask(Context context, OUser user) {
        super(context, "project.task", user);
    }

    @Override
    public Uri uri() {
        return buildURI(AUTHORITY);
    }
}
