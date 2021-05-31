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

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors._

import java.util
import javax.swing.Icon

class BrainfuckColorSettingsPage extends ColorSettingsPage {
  import BrainfuckColorSettingsPage._

  override def getIcon: Icon                                                                    = Icons.fileType
  override def getHighlighter: SyntaxHighlighter                                                = new BrainfuckSyntaxHighlighter
  override def getDemoText: String                                                              = demoText
  override def getAdditionalHighlightingTagToDescriptorMap: util.Map[String, TextAttributesKey] = null
  override def getAttributeDescriptors: Array[AttributesDescriptor]                             = descriptions
  override def getColorDescriptors: Array[ColorDescriptor]                                      = ColorDescriptor.EMPTY_ARRAY
  override def getDisplayName: String                                                           = "Brainfuck"
}

private object BrainfuckColorSettingsPage {
  import BrainfuckSyntaxHighlighter._

  val descriptions: Array[AttributesDescriptor] = Array(
    new AttributesDescriptor("Braces", braces),
    new AttributesDescriptor("Dot", dot),
    new AttributesDescriptor("Comma", comma),
    new AttributesDescriptor("Arrow", arrow),
    new AttributesDescriptor("Add", add),
    new AttributesDescriptor("Minus", minus),
    new AttributesDescriptor("Comment", lineComment)
  )

  /* https://github.com/fabianishere/brainfuck/blob/master/examples/bottles-1.bf */
  val demoText: String =
    s""">+++++++++[<+++++++++++>-]<[>[-]>[-]<<[>+>+<<-]>>[<<+>>-]>>>
       |[-]<<<+++++++++<[>>>+<<[>+>[-]<<-]>[<+>-]>[<<++++++++++>>>+<
       |-]<<-<-]+++++++++>[<->-]>>+>[<[-]<<+>>>-]>[-]+<<[>+>-<<-]<<<
       |[>>+>+<<<-]>>>[<<<+>>>-]>[<+>-]<<-[>[-]<[-]]>>+<[>[-]<-]<+++
       |+++++[<++++++<++++++>>-]>>>[>+>+<<-]>>[<<+>>-]<[<<<<<.>>>>>-
       |]<<<<<<.>>[-]>[-]++++[<++++++++>-]<.>++++[<++++++++>-]<++.>+
       |++++[<+++++++++>-]<.><+++++..--------.-------.>>[>>+>+<<<-]>
       |>>[<<<+>>>-]<[<<<<++++++++++++++.>>>>-]<<<<[-]>++++[<+++++++
       |+>-]<.>+++++++++[<+++++++++>-]<--.---------.>+++++++[<------
       |---->-]<.>++++++[<+++++++++++>-]<.+++..+++++++++++++.>++++++
       |++[<---------->-]<--.>+++++++++[<+++++++++>-]<--.-.>++++++++
       |[<---------->-]<++.>++++++++[<++++++++++>-]<++++.-----------
       |-.---.>+++++++[<---------->-]<+.>++++++++[<+++++++++++>-]<-.
       |>++[<----------->-]<.+++++++++++..>+++++++++[<---------->-]<
       |-----.---.>>>[>+>+<<-]>>[<<+>>-]<[<<<<<.>>>>>-]<<<<<<.>>>+++
       |+[<++++++>-]<--.>++++[<++++++++>-]<++.>+++++[<+++++++++>-]<.
       |><+++++..--------.-------.>>[>>+>+<<<-]>>>[<<<+>>>-]<[<<<<++
       |++++++++++++.>>>>-]<<<<[-]>++++[<++++++++>-]<.>+++++++++[<++
       |+++++++>-]<--.---------.>+++++++[<---------->-]<.>++++++[<++
       |+++++++++>-]<.+++..+++++++++++++.>++++++++++[<---------->-]<
       |-.---.>+++++++[<++++++++++>-]<++++.+++++++++++++.++++++++++.
       |------.>+++++++[<---------->-]<+.>++++++++[<++++++++++>-]<-.
       |-.---------.>+++++++[<---------->-]<+.>+++++++[<++++++++++>-
       |]<--.+++++++++++.++++++++.---------.>++++++++[<---------->-]
       |<++.>+++++[<+++++++++++++>-]<.+++++++++++++.----------.>++++
       |+++[<---------->-]<++.>++++++++[<++++++++++>-]<.>+++[<----->
       |-]<.>+++[<++++++>-]<..>+++++++++[<--------->-]<--.>+++++++[<
       |++++++++++>-]<+++.+++++++++++.>++++++++[<----------->-]<++++
       |.>+++++[<+++++++++++++>-]<.>+++[<++++++>-]<-.---.++++++.----
       |---.----------.>++++++++[<----------->-]<+.---.[-]<<<->[-]>[
       |-]<<[>+>+<<-]>>[<<+>>-]>>>[-]<<<+++++++++<[>>>+<<[>+>[-]<<-]
       |>[<+>-]>[<<++++++++++>>>+<-]<<-<-]+++++++++>[<->-]>>+>[<[-]<
       |<+>>>-]>[-]+<<[>+>-<<-]<<<[>>+>+<<<-]>>>[<<<+>>>-]<>>[<+>-]<
       |<-[>[-]<[-]]>>+<[>[-]<-]<++++++++[<++++++<++++++>>-]>>>[>+>+
       |<<-]>>[<<+>>-]<[<<<<<.>>>>>-]<<<<<<.>>[-]>[-]++++[<++++++++>
       |-]<.>++++[<++++++++>-]<++.>+++++[<+++++++++>-]<.><+++++..---
       |-----.-------.>>[>>+>+<<<-]>>>[<<<+>>>-]<[<<<<++++++++++++++
       |.>>>>-]<<<<[-]>++++[<++++++++>-]<.>+++++++++[<+++++++++>-]<-
       |-.---------.>+++++++[<---------->-]<.>++++++[<+++++++++++>-]
       |<.+++..+++++++++++++.>++++++++[<---------->-]<--.>+++++++++[
       |<+++++++++>-]<--.-.>++++++++[<---------->-]<++.>++++++++[<++
       |++++++++>-]<++++.------------.---.>+++++++[<---------->-]<+.
       |>++++++++[<+++++++++++>-]<-.>++[<----------->-]<.+++++++++++
       |..>+++++++++[<---------->-]<-----.---.+++.---.[-]<<<]...,,,,""".stripMargin
}
