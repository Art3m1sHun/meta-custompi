SUMMARY = "MINH HUNG CUSTOM IMAGE"
LICENSE = "MIT"

inherit core-image
inherit extrausers

IMAGE_OVERHEAD_FACTOR ?= "1.0"
IMAGE_ROOTFS_SIZE ?= "204800"
IMAGE_ROOTFS_MAXSIZE = "2097152"

IMAGE_INSTALL:append = " \
 custom-banner \
 packagegroup-core-buildessential \
 packagegroup-core-ssh-openssh \
 kernel-modules \
 linux-firmware \
 dhcpcd \
 iw \
 wpa-supplicant \
 wireless-regdb-static \
"
IMAGE_INSTALL += "kernel-module-libcomposite"
IMAGE_INSTALL:append = "connman connman-client"
