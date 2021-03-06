package com.nmg.teach.generator.action;


import com.nmg.teach.generator.action.config.TeachGeneratorConfig;

/**
 * 代码生成器,可以生成实体,dao,service,controller,html,js
 *
 * @author nmg
 * @Date 2017/5/21 12:38
 */
public class TeachCodeGenerator {

    public static void main(String[] args) {

        /**
         * Mybatis-Plus的代码生成器:
         *      mp的代码生成器可以生成实体,mapper,mapper对应的xml,service
         */
        TeachGeneratorConfig teachGeneratorConfig = new TeachGeneratorConfig();
        teachGeneratorConfig.doMpGeneration();

        /**
         * adi的生成器:
         *      adi的代码生成器可以生成controller,html页面,页面对应的js
         */
        teachGeneratorConfig.doAdiGeneration();
    }

}