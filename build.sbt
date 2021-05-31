name := "brainfuck-idea-plugin"
version := "0.0.2"
scalaVersion := "2.13.6"
resolvers += Values.jetBrainsResolver
idePackagePrefix := Some("io.cronenbergworld.brainfuck")
intellijPluginName := "Brainfuck Language"
intellijBuild := "211.6693.111"
intellijPlatform := IntelliJPlatform.IdeaCommunity
libraryDependencies ++= Dependency.all
Compile / compileOrder := CompileOrder.Mixed
Compile / unmanagedSourceDirectories += baseDirectory.value / "gen"

patchPluginXml := pluginXmlOptions { xml =>
  xml.version = version.value
  xml.sinceBuild = "211"
  xml.untilBuild = "212.*"
  xml.pluginDescription = IO.read(baseDirectory.value / "notes" / "pluginDescription.html")
  xml.changeNotes = IO.read(baseDirectory.value / "notes" / "pluginChanges.html")
}
enablePlugins(SbtIdeaPlugin)