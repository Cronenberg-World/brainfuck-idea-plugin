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
package runner

import com.intellij.execution.Executor
import com.intellij.execution.configurations._
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.execution.ui.FragmentedSettings
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project

import java.util

class BrainfuckRunConfiguration(project: Project, factory: ConfigurationFactory, name: String)
  extends RunConfigurationBase[Nothing](project, factory, name) {

  override def getState(executor: Executor, environment: ExecutionEnvironment): RunProfileState = null
  override def setSelectedOptions(list: util.List[FragmentedSettings.Option]): Unit = ()
  override def getConfigurationEditor: SettingsEditor[_ <: RunConfiguration] = new BrainfuckRunSettings
}
