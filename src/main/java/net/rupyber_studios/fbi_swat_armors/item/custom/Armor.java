package net.rupyber_studios.fbi_swat_armors.item.custom;

import net.minecraft.item.ItemConvertible;

import java.util.List;
import java.util.Map;

public interface Armor {
    List<String> getPattern();

    Map<Character, ItemConvertible> getInputs();
}