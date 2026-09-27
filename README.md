# FBI And SWAT Armors

Adds FBI and SWAT armor sets to Minecraft Java 26.3. This branch provides separate Fabric and NeoForge builds. Both use the `fbi_swat_armors` mod ID and the same item IDs, recipes, models, and textures.

## Requirements

- Minecraft Java 26.3 and Java 25
- Fabric: Fabric Loader 0.19.5 or newer, Fabric API for 26.3, GeckoLib 5.5.7 or newer
- NeoForge: NeoForge 26.3.0.23-beta or newer for 26.3, GeckoLib 5.5.7 or newer

Install only the JAR matching your loader. Do not install both JARs together.

## Build

Run these commands from the repository root with Java 25:

```sh
./gradlew build
cd neoforge && ./gradlew build
```

The Fabric JAR is in `build/libs/`; the NeoForge JAR is in `neoforge/build/libs/`. Use the JAR without `-sources` in its name.

## Credits

Original mod by Rupyber Studios, Pyrix25633, and Ruken. Port to Minecraft 26.3 and NeoForge by Codex for andydeng. The original mod declares the [GPL-3.0 license](https://www.gnu.org/licenses/gpl-3.0.html).
