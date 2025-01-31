/*
 * Copyright (C) 2017 makiewb
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package me.dsnet.quickopener.prefs.shell.chooser;

/**
 * Strategy the configuration of a custom shell
 *
 * @author markiewb
 */
public interface IShellConfigurator {

    /**
     * Starts the configurator. In most cases this will open a set up dialog.
     *
     * @return shell command
     */
    String configure();

    /**
     *
     * @return description for showing in the UI
     */
    String getLabel();

    /**
     * Allows a configurator to be available per OS-platform/installed program.
     *
     * @return true, if this configurator is available
     */
    boolean isAvailable();

}
