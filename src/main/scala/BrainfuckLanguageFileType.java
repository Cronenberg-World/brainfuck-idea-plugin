/*
 * Copyright 2021 the CronenbergWorld Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.cronenbergworld.brainfuck;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BrainfuckLanguageFileType extends LanguageFileType {

    public static final BrainfuckLanguageFileType INSTANCE = new BrainfuckLanguageFileType();

    private BrainfuckLanguageFileType() {
        super(BrainfuckLanguage.INSTANCE);
    }

    @Override
    public @NonNls
    @NotNull String getName() {
        return "Brainfuck";
    }

    @Override
    public @NlsContexts.Label
    @NotNull String getDescription() {
        return "Brainfuck Language";
    }

    @Override
    public @NlsSafe
    @NotNull String getDefaultExtension() {
        return "bf";
    }

    @Override
    public @Nullable Icon getIcon() {
        return Icons.fileType();
    }
}
