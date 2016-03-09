package com.spreada.utils.chinese;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Properties;

public class TraditionalToSimplifiedChineseConverter {

    public static void main(String[] s) throws Exception {
        Properties trationalProps = new Properties();
        trationalProps.load(new InputStreamReader(new FileInputStream(s[0]), ZHConverter.DEFAULT_CHARSET));
        Properties simplifiedProps = ZHConverter.convertTraditionalPropsToSimplified(trationalProps);
        simplifiedProps.store(new OutputStreamWriter(new FileOutputStream(s[1]), ZHConverter.DEFAULT_CHARSET), null);
    }

}
