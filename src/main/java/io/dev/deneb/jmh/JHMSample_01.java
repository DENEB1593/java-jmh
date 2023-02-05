package io.dev.deneb.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class JHMSample_01 {

  @Benchmark
  public void helloWorld() {
    System.out.println("JMH Hello World");
  }

  public static void main(String[] args) throws RunnerException {
    Options opt = new OptionsBuilder()
            .include(JHMSample_01.class.getSimpleName())
            .forks(1)
            .build();

    new Runner(opt).run();

  }
}