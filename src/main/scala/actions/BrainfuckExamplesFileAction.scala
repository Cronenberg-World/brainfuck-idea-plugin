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

import com.intellij.ide.actions.{CreateFileFromTemplateAction, CreateFileFromTemplateDialog}
import com.intellij.openapi.project.{DumbAware, Project}
import com.intellij.psi.PsiDirectory

class BrainfuckExamplesFileAction
  extends CreateFileFromTemplateAction("Brainfuck Examples", "Create a Brainfuck file", Icons.fileType)
    with DumbAware {

  override def buildDialog(
                            project: Project,
                            directory: PsiDirectory,
                            builder: CreateFileFromTemplateDialog.Builder
                          ): Unit =
    builder
      .setTitle("New Brainfuck file")
      .withKindD("196")
      .withKindD("196-commented")
      .withKindD("2d_table")
      .withKindD("666")
      .withKindD("abc")
      .withKindD("asciiart")
      .withKindD("atoi")
      .withKindD("awib")
      .withKindD("bench-1")
      .withKindD("bench-2")
      .withKindD("bfbf")
      .withKindD("bfc")
      .withKindD("bfcl")
      .withKindD("bfi446")
      .withKindD("bfi")
      .withKindD("bottles-1")
      .withKindD("bottles-2")
      .withKindD("bottles-3")
      .withKindD("bubblesort-1")
      .withKindD("bubblesort-2")
      .withKindD("busy-beaver")
      .withKindD("busy-beaver-overflow")
      .withKindD("cat-1")
      .withKindD("cat-2")
      .withKindD("cat-3")
      .withKindD("cell-size-1")
      .withKindD("cell-size-2")
      .withKindD("cell-size-3")
      .withKindD("cell-size-4")
      .withKindD("cell-size-5")
      .withKindD("cgbfi")
      .withKindD("char")
      .withKindD("chess")
      .withKindD("collatz")
      .withKindD("counter")
      .withKindD("css")
      .withKindD("dbf2c")
      .withKindD("dbfi")
      .withKindD("decss")
      .withKindD("div-10")
      .withKindD("dvorak")
      .withKindD("easy-opt")
      .withKindD("e")
      .withKindD("echo")
      .withKindD("endtest")
      .withKindD("factor")
      .withKindD("fib")
      .withKindD("gameoflife")
      .withKindD("golden-ratio")
      .withKindD("ha")
      .withKindD("hanoi")
      .withKindD("hanoi-opt")
      .withKindD("head")
      .withKindD("hello")
      .withKindD("hello-short")
      .withKindD("htmlconv")
      .withKindD("impeccable")
      .withKindD("insertionsort")
      .withKindD("jabh")
      .withKindD("ks")
      .withKindD("long")
      .withKindD("lost-kingdom")
      .withKindD("mac2unix")
      .withKindD("mandelbrot")
      .withKindD("mandelbrot-extreme")
      .withKindD("mandelbrot-huge")
      .withKindD("mandelbrot-opt")
      .withKindD("mandelbrot-tiny")
      .withKindD("mandelbrot-titannic")
      .withKindD("mul-10")
      .withKindD("mul")
      .withKindD("numwarp")
      .withKindD("oobrain")
      .withKindD("order")
      .withKindD("packbits")
      .withKindD("password-vault")
      .withKindD("pi-16")
      .withKindD("pi-digits")
      .withKindD("power")
      .withKindD("prime")
      .withKindD("prime-double")
      .withKindD("prttab")
      .withKindD("quicksort")
      .withKindD("quine-392")
      .withKindD("quine-400")
      .withKindD("quine-410")
      .withKindD("quine-410-commented")
      .withKindD("quine-414")
      .withKindD("quine-505")
      .withKindD("quine-505-commented")
      .withKindD("quine-540")
      .withKindD("quine-550")
      .withKindD("quine-8780")
      .withKindD("quine-bock")
      .withKindD("quine-br")
      .withKindD("quine-dc")
      .withKindD("quine-jb")
      .withKindD("quine-jr")
      .withKindD("random")
      .withKindD("reverse")
      .withKindD("rot13")
      .withKindD("rpn")
      .withKindD("ryanquine")
      .withKindD("selfportrait")
      .withKindD("short")
      .withKindD("si")
      .withKindD("sisihi")
      .withKindD("skiploop")
      .withKindD("sort")
      .withKindD("squares")
      .withKindD("t")
      .withKindD("tests")
      .withKindD("text")
      .withKindD("thuemorse")
      .withKindD("triangle")
      .withKindD("u")
      .withKindD("utm")
      .withKindD("v")
      .withKindD("wc")
      .withKindD("x")
      .withKindD("xmastree")
      .withKindD("yapi")
      .withKindD("y")
      .withKindD("z2")
      .withKindD("z3")
      .withKindD("z4")
      .withKindD("z5")
      .withKindD("z6")
      .withKindD("z7")
      .withKindD("z9a")
      .withKindD("z9")
      .withKindD("z")

  override def getActionName(directory: PsiDirectory, newName: String, templateName: String): String =
    s"Create Brainfuck file $newName"
}