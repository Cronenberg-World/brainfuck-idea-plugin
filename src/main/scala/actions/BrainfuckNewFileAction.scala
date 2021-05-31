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

package io.cronenbergworld.brainfuck
package actions

import com.intellij.ide.actions._
import com.intellij.openapi.project._
import com.intellij.psi.PsiDirectory

class BrainfuckNewFileAction
    extends CreateFileFromTemplateAction("Brainfuck File", "Create a new Brainfuck file", Icons.fileType)
    with DumbAware {

  override def buildDialog(
    project: Project,
    directory: PsiDirectory,
    builder: CreateFileFromTemplateDialog.Builder
  ): Unit =
    builder
      .setTitle("New Brainfuck File")
      .addKind("Brainfuck File", Icons.fileType, "Brainfuck File");

  override def getActionName(directory: PsiDirectory, newName: String, templateName: String): String =
    s"Create Brainfuck file $newName"
}
