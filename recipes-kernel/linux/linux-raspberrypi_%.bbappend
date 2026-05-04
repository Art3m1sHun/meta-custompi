FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " file://0001-add-mgpio-module-for-controlling-LED-on-GPIO27.patch"

KERNEL_MODULE_AUTOLOAD += "mgpio"
