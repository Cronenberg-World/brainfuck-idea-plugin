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

import com.intellij.ide.actions.CreateFileFromTemplateDialog

package object actions {

  implicit class CreateFileFromTemplateDialogBuilderOpts(private val builder: CreateFileFromTemplateDialog.Builder) extends AnyVal {
    def withKindD(name: String): CreateFileFromTemplateDialog.Builder =
      builder.addKind(name, Icons.fileType, name)
  }

}
