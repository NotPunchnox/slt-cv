package com.jmdoudoux.test.log4j;

import org.apache.log4j.Logger;

public class TestLog4j1 {

  private static Logger logger = Logger.getLogger(TestLog4j1.class);
  
  public static void main(String[] args) {
    logger.info("slt cv");
  }
}
