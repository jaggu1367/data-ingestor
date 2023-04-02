package com.tcs

import org.apache.spark.{SparkConf, SparkContext}

object DataIngestionSparkApp {


  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("DataIngtestorApp").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val rdd = sc.parallelize(List(1,2,3,4,5,6))
    println(rdd.getNumPartitions)
    rdd.collect().foreach(println)
    sc.stop()
  }

}