#!/bin/sh
echo "
  _____              _     _        _    _ 
 |  __ \            | |   | |      | |  | |
 | |  | | ___  _   _| |__ | | ___  | |__| |
 | |  | |/ _ \| | | | '_ \| |/ _ \ |  __  |
 | |__| | (_) | |_| | |_) | |  __/ | |  | |
 |_____/ \___/ \__,_|_.__/|_|\___| |_|  |_|
                                           
Uptime     : $(uptime)
Hostname   : $(hostname)
Disk Usage : $(df -h | awk '/\/$/ {print $3 " used of " $2}')
Memory     : $(free | awk '/Mem:/ {printf "%.1fM used of %.1fM", $3/1024, $2/1024}')
"
