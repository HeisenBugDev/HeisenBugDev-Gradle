package com.heisenbugdev.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class HeisenPlugin implements Plugin<Project>
{


    @Override
    public void apply(Project project)
    {
        final HeisenUploadTask upload = project.getTasks().create("heisenUpload", HeisenUploadTask.class);
        upload.setGroup("HeisenGradle");
        upload.setDescription("Uploads artifacts to HeisenBugDev. Configurable in the heisenbugdev{} block.");




    }

//    @Override
//    private UserBasePlugin<UserExtension> userPluginApplied(Project project)
//    {
//
//    }
}
