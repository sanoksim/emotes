package com.kosmx.emotes.executor.dataTypes;

public interface InputKey {
    boolean equals(InputKey key);

    String getTranslationKey();

    Text getLocalizedText();

    boolean equals(Object object);
}
