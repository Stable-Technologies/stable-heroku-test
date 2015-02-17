// Comment to get more information during initialization
logLevel := Level.Warn

// Resolvers
resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

resolvers += Resolver.url("GitHub repository", url("http://shaggyyeti.github.io/releases"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("heroku-sbt-plugin-releases", url("https://dl.bintray.com/heroku/sbt-plugins/"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.heroku" % "sbt-heroku" % "0.3.4")

// Sbt plugins
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.7")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

addSbtPlugin("default" % "sbt-sass" % "0.1.9")

addSbtPlugin("com.vmunier" % "sbt-play-scalajs" % "0.2.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")

//addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.7.6")
