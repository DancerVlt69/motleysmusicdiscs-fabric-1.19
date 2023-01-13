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
    public static SoundEvent TAUNT_LOVEJOY = registerSoundEvent("taunt_lovejoy");
    public static SoundEvent ONEDAY_LOVEJOY = registerSoundEvent("oneday_lovejoy");
    public static SoundEvent SEXSELLS_LOVEJOY = registerSoundEvent("sexsells_lovejoy");
    public static SoundEvent CAUSEFORCONCERN_LOVEJOY = registerSoundEvent("causeforconcern_lovejoy");
    public static SoundEvent OHYEAHYOUGONNACRY_LOVEJOY = registerSoundEvent("ohyeahyougonnacry_lovejoy");
    public static SoundEvent MODELBUSES_LOVEJOY = registerSoundEvent("modelbuses_lovejoy");
    public static SoundEvent CONCRETE_LOVEJOY = registerSoundEvent("concrete_lovejoy");
    public static SoundEvent PERFUME_LOVEJOY = registerSoundEvent("perfume_lovejoy");
    public static SoundEvent YOULLUNDERSTANDWHENYOUREOLDER_LOVEJOY = registerSoundEvent("youllunderstandwhenyoureolder_lovejoy");
    public static SoundEvent THEFALL_LOVEJOY = registerSoundEvent("thefall_lovejoy");
    public static SoundEvent ITSALLFUTILEITSALLPOINTLESS_LOVEJOY = registerSoundEvent("itsallfutileitsallpointless_lovejoy");




    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MotleysMusicDiscs.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}