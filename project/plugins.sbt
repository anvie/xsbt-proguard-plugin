scalaVersion := "2.9.1"

resolvers ++= Seq(
    Resolver.url("Typesafe Repo", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns),
    Resolver.url("Typesafe Maven Repo", url("http://repo.typesafe.com/typesafe/maven-ivy-releases"))(Resolver.ivyStylePatterns)
    )

libraryDependencies <+= sbtVersion("org.scala-sbt" % "scripted-plugin" % _)
