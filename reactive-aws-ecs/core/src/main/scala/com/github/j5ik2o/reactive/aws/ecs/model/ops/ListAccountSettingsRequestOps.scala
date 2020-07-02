// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListAccountSettingsRequestBuilderOps(val self: ListAccountSettingsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[SettingName]): ListAccountSettingsRequest.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): ListAccountSettingsRequest.Builder = {
    value.fold(self) { v => self.value(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalArnAsScala(value: Option[String]): ListAccountSettingsRequest.Builder = {
    value.fold(self) { v => self.principalArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def effectiveSettingsAsScala(value: Option[Boolean]): ListAccountSettingsRequest.Builder = {
    value.fold(self) { v => self.effectiveSettings(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListAccountSettingsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListAccountSettingsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

}

final class ListAccountSettingsRequestOps(val self: ListAccountSettingsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[SettingName] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalArnAsScala: Option[String] = Option(self.principalArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def effectiveSettingsAsScala: Option[Boolean] = Option(self.effectiveSettings)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListAccountSettingsRequestOps {

  implicit def toListAccountSettingsRequestBuilderOps(
      v: ListAccountSettingsRequest.Builder
  ): ListAccountSettingsRequestBuilderOps = new ListAccountSettingsRequestBuilderOps(v)

  implicit def toListAccountSettingsRequestOps(v: ListAccountSettingsRequest): ListAccountSettingsRequestOps =
    new ListAccountSettingsRequestOps(v)

}
