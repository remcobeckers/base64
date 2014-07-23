organization := "me.lessis"

name := "base64"

version := "0.1.0"

licenses := Seq(
  ("MIT", url("https://github.com/softprops/%s/blob/%s/LICENSE"
              .format(name.value,version.value))))

homepage := Some(url("https://github.com/softprops/%s/#readme".format(name.value)))

scalaVersion := "2.10.4"

scalacOptions += Opts.compile.deprecation

crossScalaVersions := Seq("2.10.4", "2.11.1")

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.0" % "test"

libraryDependencies += "commons-codec" % "commons-codec" % "1.4" % "test"

libraryDependencies += "io.netty" % "netty-all" % "4.0.7.Final" % "test"

seq(bintraySettings:_*)

bintray.Keys.packageLabels in bintray.Keys.bintray := Seq("base64", "encoding", "rfc4648")

seq(lsSettings:_*)

(LsKeys.tags in LsKeys.lsync) := Seq("base64", "encoding", "rfc4648")

(externalResolvers in LsKeys.lsync) := (resolvers in bintray.Keys.bintray).value

seq(cappiSettings:_*)
