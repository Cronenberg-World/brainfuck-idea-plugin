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

import psi.BrainfuckTypes._

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

class BrainfuckSyntaxHighlighter extends SyntaxHighlighterBase {
  import BrainfuckSyntaxHighlighter._

  override def getHighlightingLexer: Lexer = new BrainfuckLexer

  override def getTokenHighlights(tokenType: IElementType): Array[TextAttributesKey] =
    Array(
      tokenType match {
        case LB | RB      => braces
        case DOT          => dot
        case COMMA        => comma
        case LEFT | RIGHT => arrow
        case ADD          => add
        case MIN          => minus
        case LINE_COMMENT => lineComment
        case _            => undefined
      }
    )
}

private object BrainfuckSyntaxHighlighter {

  val emptyKeys   = new Array[TextAttributesKey](0)
  val braces      = createTextAttributesKey("BRAINFUCK_BRACES")
  val dot         = createTextAttributesKey("BRAINFUCK_DOT")
  val comma       = createTextAttributesKey("BRAINFUCK_COMMA")
  val arrow       = createTextAttributesKey("BRAINFUCK_ARROW")
  val add         = createTextAttributesKey("BRAINFUCK_ADD")
  val minus       = createTextAttributesKey("BRAINFUCK_MINUS")
  val lineComment = createTextAttributesKey("BRAINFUCK_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
  val undefined   = createTextAttributesKey("BRAINFUCK_UNDEFINED")
}
