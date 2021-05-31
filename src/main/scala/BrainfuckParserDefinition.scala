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

import psi._

import com.intellij.lang._
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi._
import com.intellij.psi.tree._

class BrainfuckParserDefinition extends ParserDefinition {
  import BrainfuckParserDefinition._

  override def createLexer(project: Project): Lexer                = new BrainfuckLexer
  override def createParser(project: Project): PsiParser           = new BrainfuckParser
  override def getFileNodeType: IFileElementType                   = fileElementType
  override def getCommentTokens: TokenSet                          = lineComment
  override def getStringLiteralElements: TokenSet                  = TokenSet.EMPTY
  override def getWhitespaceTokens: TokenSet                       = whitespace
  override def createElement(node: ASTNode): PsiElement            = BrainfuckTypes.Factory.createElement(node)
  override def createFile(viewProvider: FileViewProvider): PsiFile = new BrainfuckPSIFileRoot(viewProvider)
}

object BrainfuckParserDefinition {
  val fileElementType: IFileElementType = new IFileElementType(BrainfuckLanguage.INSTANCE)
  val whitespace: TokenSet              = TokenSet.create(TokenType.WHITE_SPACE)
  val lineComment: TokenSet             = TokenSet.create(BrainfuckTypes.LINE_COMMENT)
}
