// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectTextResponseBuilderOps(val self: DetectTextResponse.Builder) extends AnyVal {

  final def textDetectionsAsScala(value: Option[Seq[TextDetection]]): DetectTextResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.textDetections(v.asJava)
    }
  }

}

final class DetectTextResponseOps(val self: DetectTextResponse) extends AnyVal {

  final def textDetectionsAsScala: Option[Seq[TextDetection]] = Option(self.textDetections).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectTextResponseOps {

  implicit def toDetectTextResponseBuilderOps(v: DetectTextResponse.Builder): DetectTextResponseBuilderOps =
    new DetectTextResponseBuilderOps(v)

  implicit def toDetectTextResponseOps(v: DetectTextResponse): DetectTextResponseOps = new DetectTextResponseOps(v)

}