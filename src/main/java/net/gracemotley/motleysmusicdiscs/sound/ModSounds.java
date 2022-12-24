package net.gracemotley.motleysmusicdiscs.sound;

import net.gracemotley.motleysmusicdiscs.MotleysMusicDiscs;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static SoundEvent CONTENT_BOBURNHAM = registerSoundEvent("content_boburnham");
    public static SoundEvent COMEDY_BOBURNHAM = registerSoundEvent("comedy_boburnham");
    public static SoundEvent FACETIMEWITHMYMOM_BOBURNHAM = registerSoundEvent("facetimewithmymom_boburnham");
    public static SoundEvent HOWTHEWORLDWORKS_BOBURNHAM = registerSoundEvent("howtheworldworks_boburnham");
    public static SoundEvent WHITEWOMANSINSTAGRAM_BOBURNHAM = registerSoundEvent("whitewomansinstagram_boburnham");
    public static SoundEvent UNPAIDINTERN_BOBURNHAM = registerSoundEvent("unpaidintern_boburnham");
    public static SoundEvent BEZOSI_BOBURNHAM = registerSoundEvent("bezosi_boburnham");
    public static SoundEvent SEXTING_BOBURNHAM = registerSoundEvent("sexting_boburnham");
    public static SoundEvent LOOKWHOSINSIDEAGAIN_BOBURNHAM = registerSoundEvent("lookwhosinsideagain_boburnham");
    public static SoundEvent PROBLEMATIC_BOBURNHAM = registerSoundEvent("problematic_boburnham");
    public static SoundEvent THIRTY_BOBURNHAM = registerSoundEvent("thirty_boburnham");
    public static SoundEvent DONTWANNAKNOW_BOBURNHAM = registerSoundEvent("dontwannaknow_boburnham");
    public static SoundEvent SHIT_BOBURNHAM = registerSoundEvent("shit_boburnham");
    public static SoundEvent WELCOMETOTHEINTERNET_BOBURNHAM = registerSoundEvent("welcometotheinternet_boburnham");
    public static SoundEvent BEZOSII_BOBURNHAM = registerSoundEvent("bezosii_boburnham");
    public static SoundEvent THATFUNNYFEELING_BOBURNHAM = registerSoundEvent("thatfunnyfeeling_boburnham");
    public static SoundEvent ALLEYESONME_BOBURNHAM = registerSoundEvent("alleyesonme_boburnham");
    public static SoundEvent GOODBYE_BOBURNHAM = registerSoundEvent("goodbye_boburnham");
    public static SoundEvent ANYDAYNOW_BOBURNHAM = registerSoundEvent("anydaynow_boburnham");



    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MotleysMusicDiscs.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}