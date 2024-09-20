### Got tired finding your items in dark cave after death?
### Your precious diamond pickaxe melted in lava and the only thing you feel is pain?
### No death scatter mod allows you to configure speed of dropped items upon death!

To configure item scatter multiplier you can change corresponding value in config folder or use [Mod Menu](https://modrinth.com/mod/modmenu/)

Requires [owo-lib](https://modrinth.com/mod/owo-lib).

How it works?\
When player dies game uses _dropItem_ method with _throwRandomly = true_\
which is getting called with this parameter only when player dies. Mod injects into the return value of _dropItem_ and multiplies dropped item speed by multiplier set by player.

Can it break something?\
If you have another mod which uses _dropItem_ method with same parameter _throwRandomly = true_\
then speed multiplier will affect the dropped item. So it's virtually safe to use it even in big modpacks
