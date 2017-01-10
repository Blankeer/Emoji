package com.vanniktech.emoji.emoji.category;

import android.support.annotation.DrawableRes;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

@SuppressWarnings({"checkstyle:magicnumber", "PMD.MethodReturnsInternalArray"})
public class PeopleCategory implements EmojiCategory {
    private static final Emoji[] DATA = new Emoji[]{
            Emoji.fromCodePoints(0x1f600),
            Emoji.fromCodePoints(0x1f601),
            Emoji.fromCodePoints(0x1f602),
            Emoji.fromCodePoints(0x1f923),
            Emoji.fromCodePoints(0x1f603),
            Emoji.fromCodePoints(0x1f604),
            Emoji.fromCodePoints(0x1f605),
            Emoji.fromCodePoints(0x1f606),
            Emoji.fromCodePoints(0x1f609),
            Emoji.fromCodePoints(0x1f60a),
            Emoji.fromCodePoints(0x1f60b),
            Emoji.fromCodePoints(0x1f60e),
            Emoji.fromCodePoints(0x1f60d),
            Emoji.fromCodePoints(0x1f618),
            Emoji.fromCodePoints(0x1f617),
            Emoji.fromCodePoints(0x1f619),
            Emoji.fromCodePoints(0x1f61a),
            Emoji.fromCodePoints(0x263a),
            Emoji.fromCodePoints(0x1f642),
            Emoji.fromCodePoints(0x1f917),
            Emoji.fromCodePoints(0x1f914),
            Emoji.fromCodePoints(0x1f610),
            Emoji.fromCodePoints(0x1f611),
            Emoji.fromCodePoints(0x1f636),
            Emoji.fromCodePoints(0x1f644),
            Emoji.fromCodePoints(0x1f60f),
            Emoji.fromCodePoints(0x1f623),
            Emoji.fromCodePoints(0x1f625),
            Emoji.fromCodePoints(0x1f62e),
            Emoji.fromCodePoints(0x1f910),
            Emoji.fromCodePoints(0x1f62f),
            Emoji.fromCodePoints(0x1f62a),
            Emoji.fromCodePoints(0x1f62b),
            Emoji.fromCodePoints(0x1f634),
            Emoji.fromCodePoints(0x1f60c),
            Emoji.fromCodePoints(0x1f913),
            Emoji.fromCodePoints(0x1f61b),
            Emoji.fromCodePoints(0x1f61c),
            Emoji.fromCodePoints(0x1f61d),
            Emoji.fromCodePoints(0x1f924),
            Emoji.fromCodePoints(0x1f612),
            Emoji.fromCodePoints(0x1f613),
            Emoji.fromCodePoints(0x1f614),
            Emoji.fromCodePoints(0x1f615),
            Emoji.fromCodePoints(0x1f643),
            Emoji.fromCodePoints(0x1f911),
            Emoji.fromCodePoints(0x1f632),
            Emoji.fromCodePoints(0x2639),
            Emoji.fromCodePoints(0x1f641),
            Emoji.fromCodePoints(0x1f616),
            Emoji.fromCodePoints(0x1f61e),
            Emoji.fromCodePoints(0x1f61f),
            Emoji.fromCodePoints(0x1f624),
            Emoji.fromCodePoints(0x1f622),
            Emoji.fromCodePoints(0x1f62d),
            Emoji.fromCodePoints(0x1f626),
            Emoji.fromCodePoints(0x1f627),
            Emoji.fromCodePoints(0x1f628),
            Emoji.fromCodePoints(0x1f629),
            Emoji.fromCodePoints(0x1f62c),
            Emoji.fromCodePoints(0x1f630),
            Emoji.fromCodePoints(0x1f631),
            Emoji.fromCodePoints(0x1f633),
            Emoji.fromCodePoints(0x1f635),
            Emoji.fromCodePoints(0x1f621),
            Emoji.fromCodePoints(0x1f620),
            Emoji.fromCodePoints(0x1f607),
            Emoji.fromCodePoints(0x1f920),
            Emoji.fromCodePoints(0x1f921),
            Emoji.fromCodePoints(0x1f925),
            Emoji.fromCodePoints(0x1f637),
            Emoji.fromCodePoints(0x1f912),
            Emoji.fromCodePoints(0x1f915),
            Emoji.fromCodePoints(0x1f922),
            Emoji.fromCodePoints(0x1f927),
            Emoji.fromCodePoints(0x1f608),
            Emoji.fromCodePoints(0x1f47f),
            Emoji.fromCodePoints(0x1f479),
            Emoji.fromCodePoints(0x1f47a),
            Emoji.fromCodePoints(0x1f480),
            Emoji.fromCodePoints(0x1f47b),
            Emoji.fromCodePoints(0x1f47d),
            Emoji.fromCodePoints(0x1f916),
            Emoji.fromCodePoints(0x1f4a9),
            Emoji.fromCodePoints(0x1f63a),
            Emoji.fromCodePoints(0x1f638),
            Emoji.fromCodePoints(0x1f639),
            Emoji.fromCodePoints(0x1f63b),
            Emoji.fromCodePoints(0x1f63c),
            Emoji.fromCodePoints(0x1f63d),
            Emoji.fromCodePoints(0x1f640),
            Emoji.fromCodePoints(0x1f63f),
            Emoji.fromCodePoints(0x1f63e),
            Emoji.fromCodePoints(0x1f466),
            Emoji.fromCodePoints(0x1f466, 0x1f3fb),
            Emoji.fromCodePoints(0x1f466, 0x1f3fc),
            Emoji.fromCodePoints(0x1f466, 0x1f3fd),
            Emoji.fromCodePoints(0x1f466, 0x1f3fe),
            Emoji.fromCodePoints(0x1f466, 0x1f3ff),
            Emoji.fromCodePoints(0x1f467),
            Emoji.fromCodePoints(0x1f467, 0x1f3fb),
            Emoji.fromCodePoints(0x1f467, 0x1f3fc),
            Emoji.fromCodePoints(0x1f467, 0x1f3fd),
            Emoji.fromCodePoints(0x1f467, 0x1f3fe),
            Emoji.fromCodePoints(0x1f467, 0x1f3ff),
            Emoji.fromCodePoints(0x1f468),
            Emoji.fromCodePoints(0x1f468, 0x1f3fb),
            Emoji.fromCodePoints(0x1f468, 0x1f3fc),
            Emoji.fromCodePoints(0x1f468, 0x1f3fd),
            Emoji.fromCodePoints(0x1f468, 0x1f3fe),
            Emoji.fromCodePoints(0x1f468, 0x1f3ff),
            Emoji.fromCodePoints(0x1f469),
            Emoji.fromCodePoints(0x1f469, 0x1f3fb),
            Emoji.fromCodePoints(0x1f469, 0x1f3fc),
            Emoji.fromCodePoints(0x1f469, 0x1f3fd),
            Emoji.fromCodePoints(0x1f469, 0x1f3fe),
            Emoji.fromCodePoints(0x1f469, 0x1f3ff),
            Emoji.fromCodePoints(0x1f474),
            Emoji.fromCodePoints(0x1f474, 0x1f3fb),
            Emoji.fromCodePoints(0x1f474, 0x1f3fc),
            Emoji.fromCodePoints(0x1f474, 0x1f3fd),
            Emoji.fromCodePoints(0x1f474, 0x1f3fe),
            Emoji.fromCodePoints(0x1f474, 0x1f3ff),
            Emoji.fromCodePoints(0x1f475),
            Emoji.fromCodePoints(0x1f475, 0x1f3fb),
            Emoji.fromCodePoints(0x1f475, 0x1f3fc),
            Emoji.fromCodePoints(0x1f475, 0x1f3fd),
            Emoji.fromCodePoints(0x1f475, 0x1f3fe),
            Emoji.fromCodePoints(0x1f475, 0x1f3ff),
            Emoji.fromCodePoints(0x1f476),
            Emoji.fromCodePoints(0x1f476, 0x1f3fb),
            Emoji.fromCodePoints(0x1f476, 0x1f3fc),
            Emoji.fromCodePoints(0x1f476, 0x1f3fd),
            Emoji.fromCodePoints(0x1f476, 0x1f3fe),
            Emoji.fromCodePoints(0x1f476, 0x1f3ff),
            Emoji.fromCodePoints(0x1f47c),
            Emoji.fromCodePoints(0x1f47c, 0x1f3fb),
            Emoji.fromCodePoints(0x1f47c, 0x1f3fc),
            Emoji.fromCodePoints(0x1f47c, 0x1f3fd),
            Emoji.fromCodePoints(0x1f47c, 0x1f3fe),
            Emoji.fromCodePoints(0x1f47c, 0x1f3ff),
            Emoji.fromCodePoints(0x1f46e),
            Emoji.fromCodePoints(0x1f46e, 0x1f3fb),
            Emoji.fromCodePoints(0x1f46e, 0x1f3fc),
            Emoji.fromCodePoints(0x1f46e, 0x1f3fd),
            Emoji.fromCodePoints(0x1f46e, 0x1f3fe),
            Emoji.fromCodePoints(0x1f46e, 0x1f3ff),
            Emoji.fromCodePoints(0x1f575),
            Emoji.fromCodePoints(0x1f575, 0x1f3fb),
            Emoji.fromCodePoints(0x1f575, 0x1f3fc),
            Emoji.fromCodePoints(0x1f575, 0x1f3fd),
            Emoji.fromCodePoints(0x1f575, 0x1f3fe),
            Emoji.fromCodePoints(0x1f575, 0x1f3ff),
            Emoji.fromCodePoints(0x1f482),
            Emoji.fromCodePoints(0x1f482, 0x1f3fb),
            Emoji.fromCodePoints(0x1f482, 0x1f3fc),
            Emoji.fromCodePoints(0x1f482, 0x1f3fd),
            Emoji.fromCodePoints(0x1f482, 0x1f3fe),
            Emoji.fromCodePoints(0x1f482, 0x1f3ff),
            Emoji.fromCodePoints(0x1f477),
            Emoji.fromCodePoints(0x1f477, 0x1f3fb),
            Emoji.fromCodePoints(0x1f477, 0x1f3fc),
            Emoji.fromCodePoints(0x1f477, 0x1f3fd),
            Emoji.fromCodePoints(0x1f477, 0x1f3fe),
            Emoji.fromCodePoints(0x1f477, 0x1f3ff),
            Emoji.fromCodePoints(0x1f473),
            Emoji.fromCodePoints(0x1f473, 0x1f3fb),
            Emoji.fromCodePoints(0x1f473, 0x1f3fc),
            Emoji.fromCodePoints(0x1f473, 0x1f3fd),
            Emoji.fromCodePoints(0x1f473, 0x1f3fe),
            Emoji.fromCodePoints(0x1f473, 0x1f3ff),
            Emoji.fromCodePoints(0x1f471),
            Emoji.fromCodePoints(0x1f471, 0x1f3fb),
            Emoji.fromCodePoints(0x1f471, 0x1f3fc),
            Emoji.fromCodePoints(0x1f471, 0x1f3fd),
            Emoji.fromCodePoints(0x1f471, 0x1f3fe),
            Emoji.fromCodePoints(0x1f471, 0x1f3ff),
            Emoji.fromCodePoints(0x1f385),
            Emoji.fromCodePoints(0x1f385, 0x1f3fb),
            Emoji.fromCodePoints(0x1f385, 0x1f3fc),
            Emoji.fromCodePoints(0x1f385, 0x1f3fd),
            Emoji.fromCodePoints(0x1f385, 0x1f3fe),
            Emoji.fromCodePoints(0x1f385, 0x1f3ff),
            Emoji.fromCodePoints(0x1f936),
            Emoji.fromCodePoints(0x1f936, 0x1f3fb),
            Emoji.fromCodePoints(0x1f936, 0x1f3fc),
            Emoji.fromCodePoints(0x1f936, 0x1f3fd),
            Emoji.fromCodePoints(0x1f936, 0x1f3fe),
            Emoji.fromCodePoints(0x1f936, 0x1f3ff),
            Emoji.fromCodePoints(0x1f478),
            Emoji.fromCodePoints(0x1f478, 0x1f3fb),
            Emoji.fromCodePoints(0x1f478, 0x1f3fc),
            Emoji.fromCodePoints(0x1f478, 0x1f3fd),
            Emoji.fromCodePoints(0x1f478, 0x1f3fe),
            Emoji.fromCodePoints(0x1f478, 0x1f3ff),
            Emoji.fromCodePoints(0x1f934),
            Emoji.fromCodePoints(0x1f934, 0x1f3fb),
            Emoji.fromCodePoints(0x1f934, 0x1f3fc),
            Emoji.fromCodePoints(0x1f934, 0x1f3fd),
            Emoji.fromCodePoints(0x1f934, 0x1f3fe),
            Emoji.fromCodePoints(0x1f934, 0x1f3ff),
            Emoji.fromCodePoints(0x1f470),
            Emoji.fromCodePoints(0x1f470, 0x1f3fb),
            Emoji.fromCodePoints(0x1f470, 0x1f3fc),
            Emoji.fromCodePoints(0x1f470, 0x1f3fd),
            Emoji.fromCodePoints(0x1f470, 0x1f3fe),
            Emoji.fromCodePoints(0x1f470, 0x1f3ff),
            Emoji.fromCodePoints(0x1f935),
            Emoji.fromCodePoints(0x1f935, 0x1f3fb),
            Emoji.fromCodePoints(0x1f935, 0x1f3fc),
            Emoji.fromCodePoints(0x1f935, 0x1f3fd),
            Emoji.fromCodePoints(0x1f935, 0x1f3fe),
            Emoji.fromCodePoints(0x1f935, 0x1f3ff),
            Emoji.fromCodePoints(0x1f930),
            Emoji.fromCodePoints(0x1f930, 0x1f3fb),
            Emoji.fromCodePoints(0x1f930, 0x1f3fc),
            Emoji.fromCodePoints(0x1f930, 0x1f3fd),
            Emoji.fromCodePoints(0x1f930, 0x1f3fe),
            Emoji.fromCodePoints(0x1f930, 0x1f3ff),
            Emoji.fromCodePoints(0x1f472),
            Emoji.fromCodePoints(0x1f472, 0x1f3fb),
            Emoji.fromCodePoints(0x1f472, 0x1f3fc),
            Emoji.fromCodePoints(0x1f472, 0x1f3fd),
            Emoji.fromCodePoints(0x1f472, 0x1f3fe),
            Emoji.fromCodePoints(0x1f472, 0x1f3ff),
            Emoji.fromCodePoints(0x1f64d),
            Emoji.fromCodePoints(0x1f64d, 0x1f3fb),
            Emoji.fromCodePoints(0x1f64d, 0x1f3fc),
            Emoji.fromCodePoints(0x1f64d, 0x1f3fd),
            Emoji.fromCodePoints(0x1f64d, 0x1f3fe),
            Emoji.fromCodePoints(0x1f64d, 0x1f3ff),
            Emoji.fromCodePoints(0x1f64e),
            Emoji.fromCodePoints(0x1f64e, 0x1f3fb),
            Emoji.fromCodePoints(0x1f64e, 0x1f3fc),
            Emoji.fromCodePoints(0x1f64e, 0x1f3fd),
            Emoji.fromCodePoints(0x1f64e, 0x1f3fe),
            Emoji.fromCodePoints(0x1f64e, 0x1f3ff),
            Emoji.fromCodePoints(0x1f645),
            Emoji.fromCodePoints(0x1f645, 0x1f3fb),
            Emoji.fromCodePoints(0x1f645, 0x1f3fc),
            Emoji.fromCodePoints(0x1f645, 0x1f3fd),
            Emoji.fromCodePoints(0x1f645, 0x1f3fe),
            Emoji.fromCodePoints(0x1f645, 0x1f3ff),
            Emoji.fromCodePoints(0x1f646),
            Emoji.fromCodePoints(0x1f646, 0x1f3fb),
            Emoji.fromCodePoints(0x1f646, 0x1f3fc),
            Emoji.fromCodePoints(0x1f646, 0x1f3fd),
            Emoji.fromCodePoints(0x1f646, 0x1f3fe),
            Emoji.fromCodePoints(0x1f646, 0x1f3ff),
            Emoji.fromCodePoints(0x1f481),
            Emoji.fromCodePoints(0x1f481, 0x1f3fb),
            Emoji.fromCodePoints(0x1f481, 0x1f3fc),
            Emoji.fromCodePoints(0x1f481, 0x1f3fd),
            Emoji.fromCodePoints(0x1f481, 0x1f3fe),
            Emoji.fromCodePoints(0x1f481, 0x1f3ff),
            Emoji.fromCodePoints(0x1f64b),
            Emoji.fromCodePoints(0x1f64b, 0x1f3fb),
            Emoji.fromCodePoints(0x1f64b, 0x1f3fc),
            Emoji.fromCodePoints(0x1f64b, 0x1f3fd),
            Emoji.fromCodePoints(0x1f64b, 0x1f3fe),
            Emoji.fromCodePoints(0x1f64b, 0x1f3ff),
            Emoji.fromCodePoints(0x1f647),
            Emoji.fromCodePoints(0x1f647, 0x1f3fb),
            Emoji.fromCodePoints(0x1f647, 0x1f3fc),
            Emoji.fromCodePoints(0x1f647, 0x1f3fd),
            Emoji.fromCodePoints(0x1f647, 0x1f3fe),
            Emoji.fromCodePoints(0x1f647, 0x1f3ff),
            Emoji.fromCodePoints(0x1f926),
            Emoji.fromCodePoints(0x1f926, 0x1f3fb),
            Emoji.fromCodePoints(0x1f926, 0x1f3fc),
            Emoji.fromCodePoints(0x1f926, 0x1f3fd),
            Emoji.fromCodePoints(0x1f926, 0x1f3fe),
            Emoji.fromCodePoints(0x1f926, 0x1f3ff),
            Emoji.fromCodePoints(0x1f937),
            Emoji.fromCodePoints(0x1f937, 0x1f3fb),
            Emoji.fromCodePoints(0x1f937, 0x1f3fc),
            Emoji.fromCodePoints(0x1f937, 0x1f3fd),
            Emoji.fromCodePoints(0x1f937, 0x1f3fe),
            Emoji.fromCodePoints(0x1f937, 0x1f3ff),
            Emoji.fromCodePoints(0x1f486),
            Emoji.fromCodePoints(0x1f486, 0x1f3fb),
            Emoji.fromCodePoints(0x1f486, 0x1f3fc),
            Emoji.fromCodePoints(0x1f486, 0x1f3fd),
            Emoji.fromCodePoints(0x1f486, 0x1f3fe),
            Emoji.fromCodePoints(0x1f486, 0x1f3ff),
            Emoji.fromCodePoints(0x1f487),
            Emoji.fromCodePoints(0x1f487, 0x1f3fb),
            Emoji.fromCodePoints(0x1f487, 0x1f3fc),
            Emoji.fromCodePoints(0x1f487, 0x1f3fd),
            Emoji.fromCodePoints(0x1f487, 0x1f3fe),
            Emoji.fromCodePoints(0x1f487, 0x1f3ff),
            Emoji.fromCodePoints(0x1f6b6),
            Emoji.fromCodePoints(0x1f6b6, 0x1f3fb),
            Emoji.fromCodePoints(0x1f6b6, 0x1f3fc),
            Emoji.fromCodePoints(0x1f6b6, 0x1f3fd),
            Emoji.fromCodePoints(0x1f6b6, 0x1f3fe),
            Emoji.fromCodePoints(0x1f6b6, 0x1f3ff),
            Emoji.fromCodePoints(0x1f3c3),
            Emoji.fromCodePoints(0x1f3c3, 0x1f3fb),
            Emoji.fromCodePoints(0x1f3c3, 0x1f3fc),
            Emoji.fromCodePoints(0x1f3c3, 0x1f3fd),
            Emoji.fromCodePoints(0x1f3c3, 0x1f3fe),
            Emoji.fromCodePoints(0x1f3c3, 0x1f3ff),
            Emoji.fromCodePoints(0x1f483),
            Emoji.fromCodePoints(0x1f483, 0x1f3fb),
            Emoji.fromCodePoints(0x1f483, 0x1f3fc),
            Emoji.fromCodePoints(0x1f483, 0x1f3fd),
            Emoji.fromCodePoints(0x1f483, 0x1f3fe),
            Emoji.fromCodePoints(0x1f483, 0x1f3ff),
            Emoji.fromCodePoints(0x1f57a),
            Emoji.fromCodePoints(0x1f57a, 0x1f3fb),
            Emoji.fromCodePoints(0x1f57a, 0x1f3fc),
            Emoji.fromCodePoints(0x1f57a, 0x1f3fd),
            Emoji.fromCodePoints(0x1f57a, 0x1f3fe),
            Emoji.fromCodePoints(0x1f57a, 0x1f3ff),
            Emoji.fromCodePoints(0x1f46f),
            Emoji.fromCodePoints(0x1f5e3),
            Emoji.fromCodePoints(0x1f464),
            Emoji.fromCodePoints(0x1f465),
            Emoji.fromCodePoints(0x1f46b),
            Emoji.fromCodePoints(0x1f46c),
            Emoji.fromCodePoints(0x1f46d),
            Emoji.fromCodePoints(0x1f48f),
            Emoji.fromCodePoints(0x1f468, 0x2764, 0x1f48b, 0x1f468),
            Emoji.fromCodePoints(0x1f469, 0x2764, 0x1f48b, 0x1f469),
            Emoji.fromCodePoints(0x1f491),
            Emoji.fromCodePoints(0x1f468, 0x2764, 0x1f468),
            Emoji.fromCodePoints(0x1f469, 0x2764, 0x1f469),
            Emoji.fromCodePoints(0x1f46a),
            Emoji.fromCodePoints(0x1f468, 0x1f469, 0x1f467),
            Emoji.fromCodePoints(0x1f468, 0x1f469, 0x1f467, 0x1f466),
            Emoji.fromCodePoints(0x1f468, 0x1f469, 0x1f466, 0x1f466),
            Emoji.fromCodePoints(0x1f468, 0x1f469, 0x1f467, 0x1f467),
            Emoji.fromCodePoints(0x1f468, 0x1f468, 0x1f466),
            Emoji.fromCodePoints(0x1f468, 0x1f468, 0x1f467),
            Emoji.fromCodePoints(0x1f468, 0x1f468, 0x1f467, 0x1f466),
            Emoji.fromCodePoints(0x1f468, 0x1f468, 0x1f466, 0x1f466),
            Emoji.fromCodePoints(0x1f468, 0x1f468, 0x1f467, 0x1f467),
            Emoji.fromCodePoints(0x1f469, 0x1f469, 0x1f466),
            Emoji.fromCodePoints(0x1f469, 0x1f469, 0x1f467),
            Emoji.fromCodePoints(0x1f469, 0x1f469, 0x1f467, 0x1f466),
            Emoji.fromCodePoints(0x1f469, 0x1f469, 0x1f466, 0x1f466),
            Emoji.fromCodePoints(0x1f469, 0x1f469, 0x1f467, 0x1f467),
            Emoji.fromCodePoints(0x1f4aa),
            Emoji.fromCodePoints(0x1f4aa, 0x1f3fb),
            Emoji.fromCodePoints(0x1f4aa, 0x1f3fc),
            Emoji.fromCodePoints(0x1f4aa, 0x1f3fd),
            Emoji.fromCodePoints(0x1f4aa, 0x1f3fe),
            Emoji.fromCodePoints(0x1f4aa, 0x1f3ff),
            Emoji.fromCodePoints(0x1f933),
            Emoji.fromCodePoints(0x1f933, 0x1f3fb),
            Emoji.fromCodePoints(0x1f933, 0x1f3fc),
            Emoji.fromCodePoints(0x1f933, 0x1f3fd),
            Emoji.fromCodePoints(0x1f933, 0x1f3fe),
            Emoji.fromCodePoints(0x1f933, 0x1f3ff),
            Emoji.fromCodePoints(0x1f448),
            Emoji.fromCodePoints(0x1f448, 0x1f3fb),
            Emoji.fromCodePoints(0x1f448, 0x1f3fc),
            Emoji.fromCodePoints(0x1f448, 0x1f3fd),
            Emoji.fromCodePoints(0x1f448, 0x1f3fe),
            Emoji.fromCodePoints(0x1f448, 0x1f3ff),
            Emoji.fromCodePoints(0x1f449),
            Emoji.fromCodePoints(0x1f449, 0x1f3fb),
            Emoji.fromCodePoints(0x1f449, 0x1f3fc),
            Emoji.fromCodePoints(0x1f449, 0x1f3fd),
            Emoji.fromCodePoints(0x1f449, 0x1f3fe),
            Emoji.fromCodePoints(0x1f449, 0x1f3ff),
            Emoji.fromCodePoints(0x261d),
            Emoji.fromCodePoints(0x261d, 0x1f3fb),
            Emoji.fromCodePoints(0x261d, 0x1f3fc),
            Emoji.fromCodePoints(0x261d, 0x1f3fd),
            Emoji.fromCodePoints(0x261d, 0x1f3fe),
            Emoji.fromCodePoints(0x261d, 0x1f3ff),
            Emoji.fromCodePoints(0x1f446),
            Emoji.fromCodePoints(0x1f446, 0x1f3fb),
            Emoji.fromCodePoints(0x1f446, 0x1f3fc),
            Emoji.fromCodePoints(0x1f446, 0x1f3fd),
            Emoji.fromCodePoints(0x1f446, 0x1f3fe),
            Emoji.fromCodePoints(0x1f446, 0x1f3ff),
            Emoji.fromCodePoints(0x1f595),
            Emoji.fromCodePoints(0x1f595, 0x1f3fb),
            Emoji.fromCodePoints(0x1f595, 0x1f3fc),
            Emoji.fromCodePoints(0x1f595, 0x1f3fd),
            Emoji.fromCodePoints(0x1f595, 0x1f3fe),
            Emoji.fromCodePoints(0x1f595, 0x1f3ff),
            Emoji.fromCodePoints(0x1f447),
            Emoji.fromCodePoints(0x1f447, 0x1f3fb),
            Emoji.fromCodePoints(0x1f447, 0x1f3fc),
            Emoji.fromCodePoints(0x1f447, 0x1f3fd),
            Emoji.fromCodePoints(0x1f447, 0x1f3fe),
            Emoji.fromCodePoints(0x1f447, 0x1f3ff),
            Emoji.fromCodePoints(0x270c),
            Emoji.fromCodePoints(0x270c, 0x1f3fb),
            Emoji.fromCodePoints(0x270c, 0x1f3fc),
            Emoji.fromCodePoints(0x270c, 0x1f3fd),
            Emoji.fromCodePoints(0x270c, 0x1f3fe),
            Emoji.fromCodePoints(0x270c, 0x1f3ff),
            Emoji.fromCodePoints(0x1f91e),
            Emoji.fromCodePoints(0x1f91e, 0x1f3fb),
            Emoji.fromCodePoints(0x1f91e, 0x1f3fc),
            Emoji.fromCodePoints(0x1f91e, 0x1f3fd),
            Emoji.fromCodePoints(0x1f91e, 0x1f3fe),
            Emoji.fromCodePoints(0x1f91e, 0x1f3ff),
            Emoji.fromCodePoints(0x1f596),
            Emoji.fromCodePoints(0x1f596, 0x1f3fb),
            Emoji.fromCodePoints(0x1f596, 0x1f3fc),
            Emoji.fromCodePoints(0x1f596, 0x1f3fd),
            Emoji.fromCodePoints(0x1f596, 0x1f3fe),
            Emoji.fromCodePoints(0x1f596, 0x1f3ff),
            Emoji.fromCodePoints(0x1f918),
            Emoji.fromCodePoints(0x1f918, 0x1f3fb),
            Emoji.fromCodePoints(0x1f918, 0x1f3fc),
            Emoji.fromCodePoints(0x1f918, 0x1f3fd),
            Emoji.fromCodePoints(0x1f918, 0x1f3fe),
            Emoji.fromCodePoints(0x1f918, 0x1f3ff),
            Emoji.fromCodePoints(0x1f919),
            Emoji.fromCodePoints(0x1f919, 0x1f3fb),
            Emoji.fromCodePoints(0x1f919, 0x1f3fc),
            Emoji.fromCodePoints(0x1f919, 0x1f3fd),
            Emoji.fromCodePoints(0x1f919, 0x1f3fe),
            Emoji.fromCodePoints(0x1f919, 0x1f3ff),
            Emoji.fromCodePoints(0x1f590),
            Emoji.fromCodePoints(0x1f590, 0x1f3fb),
            Emoji.fromCodePoints(0x1f590, 0x1f3fc),
            Emoji.fromCodePoints(0x1f590, 0x1f3fd),
            Emoji.fromCodePoints(0x1f590, 0x1f3fe),
            Emoji.fromCodePoints(0x1f590, 0x1f3ff),
            Emoji.fromCodePoints(0x270b),
            Emoji.fromCodePoints(0x270b, 0x1f3fb),
            Emoji.fromCodePoints(0x270b, 0x1f3fc),
            Emoji.fromCodePoints(0x270b, 0x1f3fd),
            Emoji.fromCodePoints(0x270b, 0x1f3fe),
            Emoji.fromCodePoints(0x270b, 0x1f3ff),
            Emoji.fromCodePoints(0x1f44c),
            Emoji.fromCodePoints(0x1f44c, 0x1f3fb),
            Emoji.fromCodePoints(0x1f44c, 0x1f3fc),
            Emoji.fromCodePoints(0x1f44c, 0x1f3fd),
            Emoji.fromCodePoints(0x1f44c, 0x1f3fe),
            Emoji.fromCodePoints(0x1f44c, 0x1f3ff),
            Emoji.fromCodePoints(0x1f44d),
            Emoji.fromCodePoints(0x1f44d, 0x1f3fb),
            Emoji.fromCodePoints(0x1f44d, 0x1f3fc),
            Emoji.fromCodePoints(0x1f44d, 0x1f3fd),
            Emoji.fromCodePoints(0x1f44d, 0x1f3fe),
            Emoji.fromCodePoints(0x1f44d, 0x1f3ff),
            Emoji.fromCodePoints(0x1f44e),
            Emoji.fromCodePoints(0x1f44e, 0x1f3fb),
            Emoji.fromCodePoints(0x1f44e, 0x1f3fc),
            Emoji.fromCodePoints(0x1f44e, 0x1f3fd),
            Emoji.fromCodePoints(0x1f44e, 0x1f3fe),
            Emoji.fromCodePoints(0x1f44e, 0x1f3ff),
            Emoji.fromCodePoints(0x270a),
            Emoji.fromCodePoints(0x270a, 0x1f3fb),
            Emoji.fromCodePoints(0x270a, 0x1f3fc),
            Emoji.fromCodePoints(0x270a, 0x1f3fd),
            Emoji.fromCodePoints(0x270a, 0x1f3fe),
            Emoji.fromCodePoints(0x270a, 0x1f3ff),
            Emoji.fromCodePoints(0x1f44a),
            Emoji.fromCodePoints(0x1f44a, 0x1f3fb),
            Emoji.fromCodePoints(0x1f44a, 0x1f3fc),
            Emoji.fromCodePoints(0x1f44a, 0x1f3fd),
            Emoji.fromCodePoints(0x1f44a, 0x1f3fe),
            Emoji.fromCodePoints(0x1f44a, 0x1f3ff),
            Emoji.fromCodePoints(0x1f91b),
            Emoji.fromCodePoints(0x1f91b, 0x1f3fb),
            Emoji.fromCodePoints(0x1f91b, 0x1f3fc),
            Emoji.fromCodePoints(0x1f91b, 0x1f3fd),
            Emoji.fromCodePoints(0x1f91b, 0x1f3fe),
            Emoji.fromCodePoints(0x1f91b, 0x1f3ff),
            Emoji.fromCodePoints(0x1f91c),
            Emoji.fromCodePoints(0x1f91c, 0x1f3fb),
            Emoji.fromCodePoints(0x1f91c, 0x1f3fc),
            Emoji.fromCodePoints(0x1f91c, 0x1f3fd),
            Emoji.fromCodePoints(0x1f91c, 0x1f3fe),
            Emoji.fromCodePoints(0x1f91c, 0x1f3ff),
            Emoji.fromCodePoints(0x1f91a),
            Emoji.fromCodePoints(0x1f91a, 0x1f3fb),
            Emoji.fromCodePoints(0x1f91a, 0x1f3fc),
            Emoji.fromCodePoints(0x1f91a, 0x1f3fd),
            Emoji.fromCodePoints(0x1f91a, 0x1f3fe),
            Emoji.fromCodePoints(0x1f91a, 0x1f3ff),
            Emoji.fromCodePoints(0x1f44b),
            Emoji.fromCodePoints(0x1f44b, 0x1f3fb),
            Emoji.fromCodePoints(0x1f44b, 0x1f3fc),
            Emoji.fromCodePoints(0x1f44b, 0x1f3fd),
            Emoji.fromCodePoints(0x1f44b, 0x1f3fe),
            Emoji.fromCodePoints(0x1f44b, 0x1f3ff),
            Emoji.fromCodePoints(0x1f44f),
            Emoji.fromCodePoints(0x1f44f, 0x1f3fb),
            Emoji.fromCodePoints(0x1f44f, 0x1f3fc),
            Emoji.fromCodePoints(0x1f44f, 0x1f3fd),
            Emoji.fromCodePoints(0x1f44f, 0x1f3fe),
            Emoji.fromCodePoints(0x1f44f, 0x1f3ff),
            Emoji.fromCodePoints(0x270d),
            Emoji.fromCodePoints(0x270d, 0x1f3fb),
            Emoji.fromCodePoints(0x270d, 0x1f3fc),
            Emoji.fromCodePoints(0x270d, 0x1f3fd),
            Emoji.fromCodePoints(0x270d, 0x1f3fe),
            Emoji.fromCodePoints(0x270d, 0x1f3ff),
            Emoji.fromCodePoints(0x1f450),
            Emoji.fromCodePoints(0x1f450, 0x1f3fb),
            Emoji.fromCodePoints(0x1f450, 0x1f3fc),
            Emoji.fromCodePoints(0x1f450, 0x1f3fd),
            Emoji.fromCodePoints(0x1f450, 0x1f3fe),
            Emoji.fromCodePoints(0x1f450, 0x1f3ff),
            Emoji.fromCodePoints(0x1f64c),
            Emoji.fromCodePoints(0x1f64c, 0x1f3fb),
            Emoji.fromCodePoints(0x1f64c, 0x1f3fc),
            Emoji.fromCodePoints(0x1f64c, 0x1f3fd),
            Emoji.fromCodePoints(0x1f64c, 0x1f3fe),
            Emoji.fromCodePoints(0x1f64c, 0x1f3ff),
            Emoji.fromCodePoints(0x1f64f),
            Emoji.fromCodePoints(0x1f64f, 0x1f3fb),
            Emoji.fromCodePoints(0x1f64f, 0x1f3fc),
            Emoji.fromCodePoints(0x1f64f, 0x1f3fd),
            Emoji.fromCodePoints(0x1f64f, 0x1f3fe),
            Emoji.fromCodePoints(0x1f64f, 0x1f3ff),
            Emoji.fromCodePoints(0x1f91d),
            Emoji.fromCodePoints(0x1f91d, 0x1f3fb),
            Emoji.fromCodePoints(0x1f91d, 0x1f3fc),
            Emoji.fromCodePoints(0x1f91d, 0x1f3fd),
            Emoji.fromCodePoints(0x1f91d, 0x1f3fe),
            Emoji.fromCodePoints(0x1f91d, 0x1f3ff),
            Emoji.fromCodePoints(0x1f485),
            Emoji.fromCodePoints(0x1f485, 0x1f3fb),
            Emoji.fromCodePoints(0x1f485, 0x1f3fc),
            Emoji.fromCodePoints(0x1f485, 0x1f3fd),
            Emoji.fromCodePoints(0x1f485, 0x1f3fe),
            Emoji.fromCodePoints(0x1f485, 0x1f3ff),
            Emoji.fromCodePoints(0x1f442),
            Emoji.fromCodePoints(0x1f442, 0x1f3fb),
            Emoji.fromCodePoints(0x1f442, 0x1f3fc),
            Emoji.fromCodePoints(0x1f442, 0x1f3fd),
            Emoji.fromCodePoints(0x1f442, 0x1f3fe),
            Emoji.fromCodePoints(0x1f442, 0x1f3ff),
            Emoji.fromCodePoints(0x1f443),
            Emoji.fromCodePoints(0x1f443, 0x1f3fb),
            Emoji.fromCodePoints(0x1f443, 0x1f3fc),
            Emoji.fromCodePoints(0x1f443, 0x1f3fd),
            Emoji.fromCodePoints(0x1f443, 0x1f3fe),
            Emoji.fromCodePoints(0x1f443, 0x1f3ff),
            Emoji.fromCodePoints(0x1f463),
            Emoji.fromCodePoints(0x1f440),
            Emoji.fromCodePoints(0x1f441),
            Emoji.fromCodePoints(0x1f445),
            Emoji.fromCodePoints(0x1f444),
            Emoji.fromCodePoints(0x1f48b),
            Emoji.fromCodePoints(0x1f4a4),
            Emoji.fromCodePoints(0x1f453),
            Emoji.fromCodePoints(0x1f576),
            Emoji.fromCodePoints(0x1f454),
            Emoji.fromCodePoints(0x1f455),
            Emoji.fromCodePoints(0x1f456),
            Emoji.fromCodePoints(0x1f457),
            Emoji.fromCodePoints(0x1f458),
            Emoji.fromCodePoints(0x1f459),
            Emoji.fromCodePoints(0x1f45a),
            Emoji.fromCodePoints(0x1f45b),
            Emoji.fromCodePoints(0x1f45c),
            Emoji.fromCodePoints(0x1f45d),
            Emoji.fromCodePoints(0x1f392),
            Emoji.fromCodePoints(0x1f45e),
            Emoji.fromCodePoints(0x1f45f),
            Emoji.fromCodePoints(0x1f460),
            Emoji.fromCodePoints(0x1f461),
            Emoji.fromCodePoints(0x1f462),
            Emoji.fromCodePoints(0x1f451),
            Emoji.fromCodePoints(0x1f452),
            Emoji.fromCodePoints(0x1f3a9),
            Emoji.fromCodePoints(0x1f393),
            Emoji.fromCodePoints(0x26d1),
            Emoji.fromCodePoints(0x1f484),
            Emoji.fromCodePoints(0x1f48d),
            Emoji.fromCodePoints(0x1f302),
            Emoji.fromCodePoints(0x1f4bc)
    };

    @Override
    public Emoji[] getData() {
        return DATA;
    }

    @Override
    @DrawableRes
    public int getIcon() {
        return R.drawable.emoji_category_people;
    }
}
