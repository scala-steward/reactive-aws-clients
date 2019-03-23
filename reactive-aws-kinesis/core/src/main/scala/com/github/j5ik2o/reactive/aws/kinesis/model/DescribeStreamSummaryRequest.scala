package com.github.j5ik2o.reactive.aws.kinesis.model

final case class DescribeStreamSummaryRequest(
    streamName: Option[String] = None
) {
  def withStreamName(value: Option[String]): DescribeStreamSummaryRequest =
    copy(streamName = value)
}
