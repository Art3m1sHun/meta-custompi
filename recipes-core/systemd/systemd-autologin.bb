SUMMARY = "Enable console autologin root"
LICENSE = "MIT"

inherit systemd

SRC_URI += "file://autologin.conf"

do_install() {
    install -d ${D}${sysconfdir}/systemd/system/getty@tty1.service.d
    install -m 0644 ${WORKDIR}/autologin.conf \
        ${D}${sysconfdir}/systemd/system/getty@tty1.service.d/
}
