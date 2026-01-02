package en.project.order.entities.creature;

import en.project.order.entities.Type;

enum CreatureType implements Type {
    HUMANOID,        // humans, elves, dwarves, giants
    GOBLINOID,       // goblins, orcs, hobgoblins
    BEAST,           // wolves, lions, horses, bears
    MONSTROUS_BEAST, // chimeras, dire animals, cryptids
    DRACONIC,        // dragons, drakes, wyrms
    SERPENTINE,      // nagas, basilisks, leviathans
    ARTHROPOD,       // spiders, scorpions, insect horrors
    UNDEAD,          // zombies, liches, wraiths
    DEMONIC,         // demons, devils, hellspawn
    CELESTIAL,       // angels, watchers, divine beings
    ELEMENTAL        // fire, stone, storm, void entities
}
