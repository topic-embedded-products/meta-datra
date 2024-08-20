DESCRIPTION = "Commandline utilities for DATRA. Also demonstrates how to compile and link with libdatra."
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=9eef91148a9b14ec7f9df333daebc746"
DEPENDS = "libdatra"
SRCREV = "0f898a44006a39c26f8e1f1a77cf233dd17beb57"

inherit autotools pkgconfig gitpkgv

PV = "0+${SRCPV}"
PKGV = "0+${GITPKGV}"
S = "${WORKDIR}/git"

GITHUB_TOPIC_URI ?= "git://github.com/topic-embedded-products"
SRC_URI = "${GITHUB_TOPIC_URI}/${BPN};protocol=https;branch=master"
