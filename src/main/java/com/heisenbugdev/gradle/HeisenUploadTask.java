package com.heisenbugdev.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.IOException;
import java.net.URISyntaxException;

public class HeisenUploadTask extends DefaultTask
{

    @TaskAction
    public void doTask() throws IOException, URISyntaxException
    {
        // get artifacts
        // handshake with server
        // send manifest
        // receive PUT locations
        // upload artifacts
    }

}
