package com.shamardin.advancededitor.controller;

import java.io.File;

public interface VCSController {
    void openRepository(File file);

    void addFileToVcs(File file);

    void refreshGitPanel();

    void removeFile();
}