/*
 Copyright (c) 2015 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.emoji.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.emoji.client.core.EmojiElement;
import com.ait.toolkit.emoji.client.emojis.FlagsEmoji;
import com.ait.toolkit.emoji.client.emojis.IsEmoji;
import com.ait.toolkit.emoji.client.emojis.NatureEmoji;
import com.ait.toolkit.emoji.client.emojis.ObjectEmoji;
import com.ait.toolkit.emoji.client.emojis.PeopleEmoji;
import com.ait.toolkit.emoji.client.emojis.PlacesEmoji;
import com.ait.toolkit.emoji.client.emojis.SymbolsEmoji;
import com.google.gwt.core.client.GWT;

public final class Emoji {

    private static final String DEFAULT_BACK_GROUND_IMGAGE_URL = GWT.getModuleBaseURL() + "e.png";
    private static String backGroundImageUrl;

    private Emoji() {

    }

    public static EmojiElement get( IsEmoji emoji ) {
        return getEmojiElement( emoji );
    }

    public static String getBackGroundImageUrl() {
        return backGroundImageUrl;
    }

    public static List<PeopleEmoji> getPeopleEmojis() {
        return new ArrayList<PeopleEmoji>( Arrays.asList( PeopleEmoji.values() ) );
    }

    public static List<NatureEmoji> getNatureEmojis() {
        return new ArrayList<NatureEmoji>( Arrays.asList( NatureEmoji.values() ) );
    }

    public static List<ObjectEmoji> getObjectsEmojis() {
        return new ArrayList<ObjectEmoji>( Arrays.asList( ObjectEmoji.values() ) );
    }

    public static List<PlacesEmoji> getPlacesEmojis() {
        return new ArrayList<PlacesEmoji>( Arrays.asList( PlacesEmoji.values() ) );
    }

    public static List<SymbolsEmoji> getSymbolsEmojis() {
        return new ArrayList<SymbolsEmoji>( Arrays.asList( SymbolsEmoji.values() ) );
    }

    public static List<FlagsEmoji> getFlagsEmojis() {
        return new ArrayList<FlagsEmoji>( Arrays.asList( FlagsEmoji.values() ) );
    }

    public static void setBackGroundImageUrl( String backGroundImageUrl ) {
        Emoji.backGroundImageUrl = backGroundImageUrl;
    }

    private static EmojiElement getEmojiElement( final IsEmoji emoji ) {
        if( backGroundImageUrl == null ) {
            backGroundImageUrl = DEFAULT_BACK_GROUND_IMGAGE_URL;
        }
        EmojiElement element = new EmojiElement() {
            @Override
            protected String getEmojiStyleName() {
                return emoji.getName();
            }
        };

        return element;
    }

}
