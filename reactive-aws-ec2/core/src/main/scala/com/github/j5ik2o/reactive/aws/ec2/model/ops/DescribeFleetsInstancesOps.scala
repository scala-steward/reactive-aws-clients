// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFleetsInstancesBuilderOps(val self: DescribeFleetsInstances.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateAndOverridesAsScala(
      value: Option[LaunchTemplateAndOverridesResponse]
  ): DescribeFleetsInstances.Builder = {
    value.fold(self) { v => self.launchTemplateAndOverrides(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecycleAsScala(value: Option[InstanceLifecycle]): DescribeFleetsInstances.Builder = {
    value.fold(self) { v => self.lifecycle(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdsAsScala(value: Option[Seq[String]]): DescribeFleetsInstances.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[InstanceType]): DescribeFleetsInstances.Builder = {
    value.fold(self) { v => self.instanceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala(value: Option[PlatformValues]): DescribeFleetsInstances.Builder = {
    value.fold(self) { v => self.platform(v) }
  }

}

final class DescribeFleetsInstancesOps(val self: DescribeFleetsInstances) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateAndOverridesAsScala: Option[LaunchTemplateAndOverridesResponse] =
    Option(self.launchTemplateAndOverrides)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecycleAsScala: Option[InstanceLifecycle] = Option(self.lifecycle)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdsAsScala: Option[Seq[String]] =
    Option(self.instanceIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala: Option[PlatformValues] = Option(self.platform)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFleetsInstancesOps {

  implicit def toDescribeFleetsInstancesBuilderOps(
      v: DescribeFleetsInstances.Builder
  ): DescribeFleetsInstancesBuilderOps = new DescribeFleetsInstancesBuilderOps(v)

  implicit def toDescribeFleetsInstancesOps(v: DescribeFleetsInstances): DescribeFleetsInstancesOps =
    new DescribeFleetsInstancesOps(v)

}
