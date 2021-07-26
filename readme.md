# pacmc

**`pacmc`** is a package manager for Fabric Minecraft mods.

The aim of this project is to massively reduce the effort you have to put in to installing - and most importantly -
keeping your mods up to date.

## Installation

#### Arch Linux

`pacmc` is the name of [the package in the **AUR**](https://aur.archlinux.org/packages/pacmc/).

#### Windows via [scoop](https://scoop.sh)

```sh
scoop bucket add games
scoop install pacmc
# update later with
scoop update pacmc
```

#### Other

Download one of the released archives from the [releases page](https://github.com/bluefireoly/pacmc/releases).
Extract the archive. Inside there will be a `bin` directory.
Run the shell script using `./pacmc`.

## Quick start

```bash
# add the .minecraft folder as an archive
pacmc init
# search for mods
pacmc search minihud
# install a mod
pacmc install lithium
```

## Usage

The main command is `pacmc`. You can add `-h` to any command to get help.

### Command overview

```
Commands:
  install  Installs a minecraft mod
  update   Updates the mods inside an archive
  search   Searches for mods
  list     Lists the installed mods
  remove   Removes a minecraft mod
  archive  Manages your mod archives
  init     Sets the pacmc defaults
  refresh  Refreshes the local mod files according to the database
  load     Loads one archive into another
  info     Prints debug information
```

### Archives

Archives are the places (folders) where your mods are stored. Your `.minecraft` folder is an archive by default, but you
can add more (for example to manage mods on a server, which `pacmc` is designed for aswell).

#### Init the default archive

To add the `.minecraft` folder as an archive:
```zsh
pacmc init
```

#### Add an archive

```zsh
pacmc archive add myarchive [./path/to/my/archive]
```

#### List all existing archives

```zsh
pacmc archive list
```

#### Remove an archive

```zsh
pacmc archive remove myarchive
```

### Search for mods

```zsh
pacmc search sodium
# or
pacmc search "Fabric API"
```

_this searches for mods for the latest minecraft version by default_

For a specific game version:

```zsh
pacmc search -g 1.15.2 "Fabric API"
```

or version independent:

```zsh
pacmc search -i "minimap"
```

### Install a mod

```zsh
# via the mod id
pacmc install 447425
# or via a search term
pacmc install tweakeroo
```

or to a specific archive:

```zsh
pacmc install -a myarchive 447425
```

_when installing using a search term, you may be prompted to select a mod from a couple of options_
